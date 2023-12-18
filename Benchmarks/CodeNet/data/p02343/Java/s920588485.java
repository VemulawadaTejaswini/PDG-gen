public class
Main
{
  int[ ] a;

  private void
  unite (
    int x,
    int y
    )
  {
    if ( a[ y ] != y )
      unite ( x, a[ y ] );
    else
      a[ y ] = x;
  }

  private int
  getRepresentation (
    int x
    )
  {
    if ( a[ x ] == x )
      return ( x );

    a[ x ] = getRepresentation ( a[ x ] );
    return ( a[ x ] );
  }

  private boolean
  same (
    int x,
    int y
    )
  {
    return ( getRepresentation ( x ) == getRepresentation ( y ) );
  }

  public void
  run (
    java.io.InputStream in,
    java.io.PrintStream out
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( in );
    int n, q;
    int i;

    n = sc.nextInt ( );
    q = sc.nextInt ( );

    a = new int[ n ];
    for ( i = 0; i < n; ++i )
      a[ i ] = i;

    for ( i = 0; i < q; ++i )
    {
      int c, x, y;

      c = sc.nextInt ( );
      x = sc.nextInt ( );
      y = sc.nextInt ( );
      if ( c == 0 )
      {
        if ( !same ( x, y ) )
          unite ( x, y );
      }
      else
        System.out.println ( same ( x, y ) ? "1" : "0" );
    }

    sc.close ( );
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( System.in, System.out );
  }
}