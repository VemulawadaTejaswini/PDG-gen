public class
Main
{
  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    int i;

    for ( ; ; )
    {
      int n;

      n = sc.nextInt ( );
      if ( n == 0 ) break ;
      for ( i = 0; i < n; ++i )
      {
        int x1, y1, z1, w1;
        int x2, y2, z2, w2;

        x1 = sc.nextInt ( ); y1 = sc.nextInt ( ); z1 = sc.nextInt ( ); w1 = sc.nextInt ( );
        x2 = sc.nextInt ( ); y2 = sc.nextInt ( ); z2 = sc.nextInt ( ); w2 = sc.nextInt ( );

        out.printf ( "%d %d %d %d\n"
                   , x1 * x2 - y1 * y2 - z1 * z2 - w1 * w2
                   , y1 * x2 + x1 * y2 - w1 * z2 + z1 * w2
                   , z1 * x2 + w1 * y2 + x1 * z2 - y1 * w2
                   , w1 * x2 - z1 * y2 + y1 * z2 + x1 * w2 );
      }
    }
  }

  public static void
  main (
    final String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ), System.out );
  }
}