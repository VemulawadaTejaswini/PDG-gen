public class
Main
{
  private static int
  evaluate (
    final int[ ] a,
    final int    k
    )
  {
    int res = 0;
    int t;
    int i;

    t = 1;
    for ( i = 0; i < a.length; ++i )
    {
      if ( i >= 5 )
        t /= a[ i - 5 ];
      t *= a[ i ];
      res = Math.max ( res, t );
    }

    return ( res );
  }

  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    int[ ] a;
    int n, k;
    int r1, r2 = 0;
    int i, j;

    n = sc.nextInt ( );
    k = sc.nextInt ( );
    a = new int[ n ];
    for ( i = 0; i < a.length; ++i )
      a[ i ] = sc.nextInt ( );

    r1 = evaluate ( a, k );
    for ( i = 0; i < a.length; ++i )
    for ( j = i + 1; j < a.length; ++j )
    {
      int t;

      t = a[ i ]; a[ i ] = a[ j ]; a[ j ] = t;
      r2 = Math.max ( r2, evaluate ( a, k ) );
      t = a[ i ]; a[ i ] = a[ j ]; a[ j ] = t;
    }

    out.println ( r2 < r1 ? "NO GAME" : r2 - r1 );
  }

  public static void
  main (
    final String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ), System.out );
  }
}