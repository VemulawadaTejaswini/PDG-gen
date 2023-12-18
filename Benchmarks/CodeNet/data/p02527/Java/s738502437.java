public class
Main
{
  private static void
  sort (
    int[ ] a,
    int    n
    )
  {
    sort ( a, 0, n - 1 );
  }

  private static void
  sort (
    int[ ] a,
    int    low,
    int    high
    )
  {
    int m;

    if ( low == high )
      return ;

    m = partition ( a, low, high, a[ low ] );
    sort ( a, low,   m );
    sort ( a, m + 1, high );
  }

  private static int
  partition (
    int[ ] a,
    int    low,
    int    high,
    int    x
    )
  {
    int[ ] b = new int[ high - low + 1 ];
    int l, m, h;
    int i;

    l = m = low; h = high;
    for ( i = 0; i < b.length; ++i )
    {
      b[ i ] = a[ low + i ];
      if ( b[ i ] < x ) ++m;
    }
    for ( i = 0; i < b.length; ++i )
    {
      if ( b[ i ] < x  ) a[ l++ ] = b[ i ];
      if ( b[ i ] == x ) a[ m++ ] = b[ i ];
      if ( x < b[ i ]  ) a[ h-- ] = b[ i ];
    }
    if ( h < high ) return ( h );
    else            return ( h - 1 );
  }

  public static void
  main (
    final String[ ] args
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int[ ] a = new int[ sc.nextInt ( ) ];
    int i;

    for ( i = 0; i < a.length; ++i )
      a[ i ] = sc.nextInt ( );
    sort ( a, a.length );

    for ( i = 0; i < a.length; ++i )
    {
      if ( i != 0 )
        System.out.print ( " " );
      System.out.print ( a[ i ] );
    }
    System.out.println ( );
  }
}