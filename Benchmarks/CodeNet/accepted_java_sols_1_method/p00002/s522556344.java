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
      int eger = cin.nextInt ( ) + cin.nextInt ( );
      int res = 0;

      for ( ; eger != 0; eger /= 10 )
      {
        ++res;
      }

      System.out.println ( res == 0 ? "1" : res );
    }

    return ;
  }
}