public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int c;
    
    for ( c = 1; ; ++c )
    {
      int d;
      
      d = sc.nextInt ( );
      if ( d == 0 )
        break ;
        
      System.out.println ( "Case " + c + ": " + d );
    }

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