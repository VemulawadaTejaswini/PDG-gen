public class
Main
{
  @SuppressWarnings("unchecked")
  public void
  run (
    java.io.InputStream in,
    java.io.PrintStream out
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( in );
    java.util.List[ ] G;
    int[ ] res;
    int n, m;
    int i;

    n = sc.nextInt ( );
    m = sc.nextInt ( );

    G  = new java.util.List[ n ];
    for ( i = 0; i < G.length; ++i )
      G[ i ] = new java.util.LinkedList ( );
    for ( i = 0; i < m; ++i )
    {
      int s, t;

      s = sc.nextInt ( );
      t = sc.nextInt ( );
      G[ s ].add ( t );
    }

    res = topologicalSort ( convertGraph ( G ) );
    for ( i = 0; i < res.length; ++i )
      out.println ( res[ i ] );

    sc.close ( );
  }

  /** ??°?????????List ??¨???????¨?????????????????????? */
  private static int[ ][ ]
  convertGraph (
    java.util.List[ ] G
    )
  {
    int[ ][ ] r = new int[ G.length ][ ];
    java.util.Iterator it;
    int i, j;
   
    for ( i = 0; i < r.length; ++i )
    {
      r[ i ] = new int[ G[ i ].size ( ) ];
      for ( j = 0, it = G[ i ].iterator ( ); it.hasNext ( ); ++j )
        r[ i ][ j ] = ( (Integer)it.next ( ) ).intValue ( );
    }
   
    return ( r );
  }

  private static int[ ]
  topologicalSort (
    int[ ][ ] G
    )
  {
    java.util.Queue<Integer> lis = new java.util.LinkedList<Integer> ( );
    int[ ] deg = new int[ G.length ];
    int[ ] res = new int[ G.length ];
    int sp = 0;
    int i, j;

    for ( i = 0; i < G.length; ++i )
    for ( j = 0; j < G[ i ].length; ++j )
      ++deg[ G[ i ][ j ] ];

    for ( i = 0; i < G.length; ++i )
    {
      lis.add ( i );
      while ( !lis.isEmpty ( ) )
      {
        final int s = lis.poll ( );
        if ( deg[ s ] == 0 )
        {
          res[ sp++ ] = s;
          deg[ s ] = -1;
          for ( j = 0; j < G[ s ].length; ++j )
          {
            --deg[ G[ s ][ j ] ];
            lis.add ( G[ s ][ j ] );
          }
        }
      }
    }

    return ( res );
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( System.in, System.out );
  }
}