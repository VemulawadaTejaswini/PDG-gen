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
    int i;

    if ( high <= low )
      return ;

    m = high;
    for ( i = low; i <= m; )
    {
      if ( a[ low ] < a[ i ] ) swap ( a, i, m-- );
      else                     ++i;
    }
    swap ( a, low, m );

    sort ( a, low, m - 1 );
    sort ( a, m + 1, high );
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