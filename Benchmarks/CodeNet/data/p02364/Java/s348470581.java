public class
Main
{
  public void
  run (
    java.io.InputStream in,
    java.io.PrintStream out
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( in );
    java.util.List<java.util.List<Integer>> G, p;
    int[ ][ ][ ] ret;
    int res;
    int n, m;
    int i, j;

    n = sc.nextInt ( );
    m = sc.nextInt ( );

    G = new java.util.ArrayList<java.util.List<Integer>> ( );
    p = new java.util.ArrayList<java.util.List<Integer>> ( );
    for ( i = 0; i < n; ++i )
    {
      G.add ( new java.util.LinkedList<Integer> ( ) );
      p.add ( new java.util.LinkedList<Integer> ( ) );
    }

    for ( i = 0; i < m; ++i )
    {
      int s, t, w;

      s = sc.nextInt ( );
      t = sc.nextInt ( );
      w = sc.nextInt ( );

      G.get ( s ).add ( t );
      p.get ( s ).add ( w );
      G.get ( t ).add ( s );
      p.get ( t ).add ( w );
    }

    ret = kruskal ( ls2ary ( G ), ls2ary ( p ) );

    res = 0;
    for ( i = 0; i < ret[ 0 ].length; ++i )
    for ( j = 0; j < ret[ 0 ][ i ].length; ++j )
    if ( i <= ret[ 0 ][ i ][ j ] )
    {
      res += ret[ 1 ][ i ][ j ];
    }
    out.println ( res );

    sc.close ( );
  }

  /** ???????????¢?????¨??????????????¨?????????????????? */
  private static int[ ][ ]
  ls2ary (
    java.util.List<java.util.List<Integer>> d
    )
  {
    java.util.Iterator<java.util.List<Integer>> it;
    java.util.Iterator<Integer> jt;
    int[ ][ ] res;
    int i, j;

    res = new int[ d.size ( ) ][ ];
    for ( i = 0, it = d.iterator ( ); i < res.length; ++i )
    {
      java.util.List<Integer> lis = it.next ( );

      res[ i ] = new int[ lis.size ( ) ];
      for ( j = 0, jt = lis.iterator ( ); j < res[ i ].length; ++j )
        res[ i ][ j ] = jt.next ( ).intValue ( );
    }

    return ( res );
  }

  /** ????????????????????°??????(G,p) ?????????????????????????°???¨?????¨????±??????????
    * 
    * (?????????)[ 0 ]: ????°???¨?????¨?????¨?????°??????????¨???????
    * (?????????)[ 1 ]: ????°???¨?????¨?????¨?????°???????????????
    */
  private static int[ ][ ][ ]
  kruskal (
    int[ ][ ] G,
    int[ ][ ] p
    )
  {
    class Edge implements Comparable<Edge> {
      public int s, t, d;
      public Edge ( int s, int t, int d ) { this.s = s; this.t = t; this.d = d; }
      public int compareTo ( Edge o ) { return ( this.d - o.d ); }
    }
    java.util.List<java.util.List<Integer>> rG, rp;
    java.util.List<Edge> lis;
    java.util.Iterator<Edge> it;
    UnionFind obj;
    int i, j;

    rG = new java.util.ArrayList<java.util.List<Integer>> ( );
    rp = new java.util.ArrayList<java.util.List<Integer>> ( );
    for ( i = 0; i < G.length; ++i )
    {
      rG.add ( new java.util.LinkedList<Integer> ( ) );
      rp.add ( new java.util.LinkedList<Integer> ( ) );
    }

    lis = new java.util.ArrayList<Edge> ( );
    for ( i = 0; i < G.length; ++i )
    for ( j = 0; j < G[ i ].length; ++j )
    {
      if ( i <= G[ i ][ j ] )
        lis.add ( new Edge ( i, G[ i ][ j ], p[ i ][ j ] ) );
    }
    lis.sort ( null );

    obj = new UnionFind ( G.length );
    for ( it = lis.iterator ( ); it.hasNext ( ); )
    {
      Edge e = it.next ( );

      if ( obj.combinedp ( e.s, e.t ) )
        continue ;

      rG.get ( e.s ).add ( e.t );
      rp.get ( e.s ).add ( e.d );
      rG.get ( e.t ).add ( e.s );
      rp.get ( e.t ).add ( e.d );
      obj.combine ( e.s, e.t );
    }

    return ( new int[ ][ ][ ] { ls2ary ( rG ), ls2ary ( rp ) } );
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( System.in, System.out );
  }

  /** ????????¢?????????????????? */
  private static class
  UnionFind
  {
    /** Union Find Node ??????????´? */
    private int[ ] h;
    /** Union Find (Sub-)Tree ???????´???° */
    private int[ ] w;
   
    public
    UnionFind (
      /** 0..(size-1) ?????§?????´??°??????????????±??? */
      int size
      )
    {
      h = new int[ size ];
      w = new int[ size ];
      java.util.Arrays.fill ( h, -1 );
      java.util.Arrays.fill ( w,  1 );
    }
   
    /** p ??¨q ???????????¨?????? */
    public void
    combine (
      int p,
      int q
      )
    {
      p = rep ( p );
      q = rep ( q );
      if ( p == q ) return ;
      if ( w[ q ] < w[ p ] )
      {
        final int t = p;
        p = q;
        q = t;
      }
      h[ p ] = q;
      w[ q ] += w[ p ];
    }
   
    /** p ??¨q ???????????§????????????????????? */
    public boolean
    combinedp (
      int p,
      int q
      )
    {
      return ( rep ( p ) == rep ( q ) );
    }
   
    /** ??£??¨???????????? */
    private int
    rep (
      int p
      )
    {
      if ( h[ p ] == -1 )
        return ( p );
      h[ p ] = rep ( h[ p ] );
      return ( h[ p ] );
    }
  }
}