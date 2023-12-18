public class
Main
{
  public void
  run (
    )
  {
    java.util.Stack<String> lis = new java.util.Stack<String> ( );
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    
    for ( ; ; )
    {
      final String cmd = sc.next ( );
      
      if ( cmd.equals ( "push" ) )
      {
        lis.push ( sc.next ( ) );
      }
      else if ( cmd.equals ( "pop" ) )
      {
        System.out.println ( lis.pop ( ) );
      }
      else
      {
        break ;
      }
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