public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int a, b;
      
    a = sc.nextInt ( );
    b = sc.nextInt ( );
    System.out.println ( ( a / b ) + " " + ( a % b ) + " " + String.format ( "%.5f", (double)a / (double)b ) );

    return ;
  }

  public static void
  main (
    String[ ] args
    )
  {
    ( new Main ( ) ).run ( );
    
    return ;
  }
}