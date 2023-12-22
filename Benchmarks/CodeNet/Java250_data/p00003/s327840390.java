public class
Main
{
  public static void
  main (
    String[ ] args
    )
  {
    java.util.Scanner cin = new java.util.Scanner ( System.in );
    int n;

    for ( n = cin.nextInt ( ); n != 0; --n )
    {
      int[ ] a = { cin.nextInt ( ), cin.nextInt ( ), cin.nextInt ( ) };

      java.util.Arrays.sort ( a );
      System.out.println ( a[ 0 ] * a[ 0 ] + a[ 1 ] * a[ 1 ] == a[ 2 ] * a[ 2 ]
        ? "YES" : "NO" );
    }

    return ;
  }
}