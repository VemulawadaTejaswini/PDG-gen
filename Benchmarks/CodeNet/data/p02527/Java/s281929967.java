public class
Main
{
  private static void
  sort (
    int[ ] a,
    int    n
    )
  {
    sort ( a, new int[ n ], 0, n - 1 );
  }

  private static void
  sort (
    int[ ] a,
    int[ ] t,
    int    low,
    int    high
    )
  {
    int i, j;
    int mid, l, h;

    if ( high == low )
      return ;

    mid = ( low + high ) / 2;
    sort ( a, t, low, mid );
    sort ( a, t, mid + 1, high );

    for ( i = low; i <= high; ++i )
      t[ i ] = a[ i ];

    l = low; h = mid + 1;
    for ( i = low; i <= high; ++i )
    {
      if ( mid < l  ) { a[ i ] = t[ h++ ]; continue ; }
      if ( high < h ) { a[ i ] = t[ l++ ]; continue ; }
      if ( t[ l ] <= t[ h ] ) a[ i ] = t[ l++ ];
      else                    a[ i ] = t[ h++ ];
    }
  }

  private static void
  swap (
    int[ ] a,
    int    u,
    int    v
    )
  {
    final int t = a[ u ];
    a[ u ] = a[ v ];
    a[ v ] = t;
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