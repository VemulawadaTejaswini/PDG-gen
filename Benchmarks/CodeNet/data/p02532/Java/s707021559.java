public class
Main
{
  public void
  run (
    )
  {
    java.util.Stack<String>[ ] lis;
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int n;
    int i;
    
    n = sc.nextInt ( );
    lis = new java.util.Stack[ n ];
    for ( i = 0; i < lis.length; ++i )
      lis[ i ] = new java.util.Stack<String> ( );

    for ( ; ; )
    {
      final String cmd = sc.next ( );
      
      if ( cmd.equals ( "push" ) )
      {
        final int a = sc.nextInt ( ) - 1;
         
        lis[ a ].push ( sc.next ( ) );
      }
      else if ( cmd.equals ( "pop" ) )
      {        
        System.out.println ( lis[ sc.nextInt ( ) - 1 ].pop ( ) );
      }
      else if ( cmd.equals ( "move" ) )
      {
        final int a = sc.nextInt ( ) - 1;
        final int b = sc.nextInt ( ) - 1;
        
        lis[ b ].push ( lis[ a ].pop ( ) );
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