public class
Main
{
  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    String s;
    int[ ] d = new int[ 26 ];
    boolean[ ] f;
    int i;

    s = sc.next ( );
    f = new boolean[ s.length ( ) ];
    for ( i = 0; i < s.length ( ); ++i )
    {
      d[ s.charAt ( i ) - 'A' ] += 1;
      if ( i - 8 >= 0 )
        d[ s.charAt ( i - 8 ) - 'A' ] -= 1;
      if ( d[ 'A' - 'A' ] == 2
        && d[ 'I' - 'A' ] == 1
        && d[ 'D' - 'A' ] == 1
        && d[ 'U' - 'A' ] == 1
        && d[ 'N' - 'A' ] == 2
        && d[ 'Y' - 'A' ] == 1 ) f[ i - 7 ] = true;
    }

    for ( i = 0; i < s.length ( ); )
    {
      if ( f[ i ] )
      {
        out.print ( "AIZUNYAN" );
        i += 8;
      }
      else
      {
        out.print ( s.charAt ( i ) );
        i += 1;
      }
    }
    out.println ( );
  }

  public static void
  main (
    final String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ), System.out );
  }
}