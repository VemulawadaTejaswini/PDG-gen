public class
Main
{
  public void
  run (
    java.util.Scanner sc
    )
  {
    int[ ] a;
    int i, j;

    a = new int[ sc.nextInt ( ) ];
    for ( i = 0; i < a.length; ++i )
      a[ i ] = sc.nextInt ( );


    for ( i = 0; i < a.length; ++i )
    {
      final int t = a[ i ];
      for ( j = i - 1; j >= 0; --j )
      {
        if ( t < a[ j ] )
        {
          a[ j + 1 ] = a[ j ];
          a[ j ] = t;
        }
      }

      printArray ( a );
    }
  }

  private void
  printArray (
    int[ ] a
    )
  {
    int i;

    for ( i = 0; i < a.length; ++i )
    {
      System.out.print ( a[ i ] );
      if ( i + 1 < a.length )
        System.out.print ( " " );
      else
        System.out.println ( );
    }
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ) );
  }
}