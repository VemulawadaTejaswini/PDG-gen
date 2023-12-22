public class
Main
{
  public static void
  main (
    String[ ] args
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int a, b;
    
    a = sc.nextInt ( );
    b = sc.nextInt ( );
    
    if ( a < b )
      System.out.println ( "a < b" );
    else if ( a > b )
      System.out.println ( "a > b" );
    else
      System.out.println ( "a == b" );  

    return ;
  }
}