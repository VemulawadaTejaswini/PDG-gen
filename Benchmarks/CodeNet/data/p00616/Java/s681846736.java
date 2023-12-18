public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int i, j;
    
    for ( ; ; )
    {
      java.util.Set<Pair> lis = new java.util.TreeSet<Pair> ( );
      int n, h;
      
      n = sc.nextInt ( );
      h = sc.nextInt ( );
      if ( n == 0 && h == 0 )
        break ;
      
      for ( i = 0; i < h; ++i )
      {
        String rw;
        int a, b;
        
        rw = sc.next ( );
        a = sc.nextInt ( );
        b = sc.nextInt ( );
        
        if ( rw.equals ( "xy" ) )
        {
          for ( j = 1; j <= n; ++j )
            lis.add ( new Pair ( a, b, j ) );
        }
        else if ( rw.equals ( "xz" ) )
        {
          for ( j = 1; j <= n; ++j )
            lis.add ( new Pair ( a, j, b ) );
        }
        else
        {
          for ( j = 1; j <= n; ++j )
            lis.add ( new Pair ( j, a, b ) );
        }
      }
      
      System.out.println ( n * n * n - lis.size ( ) );
    }
  
    return ;
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( );
  
    return ;
  }
  
  private class
  Pair implements Comparable<Pair>
  {
    private int a;
    private int b;
    private int c;
    
    Pair (
      int a,
      int b,
      int c
      )
    {
      this.a = a;
      this.b = b;
      this.c = c;
      
      return ;
    }
    
    public int
    compareTo (
      Pair p
      )
    {
      if ( a - p.a != 0 )
        return ( a - p.a );
      if ( b - p.b != 0 )
        return ( b - p.b );
        
      return ( c - p.c );
    }
  }
}