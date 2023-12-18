public class
Main
{
  public void
  run (
    )
  {
    int i;
    
    for ( i = 0; i < 1000; ++i )
      System.out.println ( "Hello World" ); 
  
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