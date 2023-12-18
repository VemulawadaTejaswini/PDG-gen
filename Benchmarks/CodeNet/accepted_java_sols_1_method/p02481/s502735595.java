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
    
    System.out.println ( a * b + " " + 2 * ( a + b ) );
  
    return ;
  }
}