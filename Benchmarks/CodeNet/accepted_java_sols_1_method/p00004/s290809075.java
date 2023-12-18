public class
Main
{
  public static void
  main (
    String[ ] args
    )
  {
    java.util.Scanner cin = new java.util.Scanner ( System.in );

    while ( cin.hasNext ( ) )
    {
      double a, b, c, d, p, q;
      double det;
      
      a = cin.nextDouble ( ); b = cin.nextDouble ( ); p = cin.nextDouble ( );
      c = cin.nextDouble ( ); d = cin.nextDouble ( ); q = cin.nextDouble ( );
      det = a * d - b * c;
      System.out.printf ( "%.3f %.3f\n"
                        , ( d * p - b * q ) / det + 0.
                        , ( a * q - c * p ) / det + 0. );
    }

    return ;
  }
}