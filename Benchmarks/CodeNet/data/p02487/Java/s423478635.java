public class
Main
{
  public void
  run (
    )
  {
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int i, j;
    
    for ( ; ; )
    {
      int h, w;
      
      h = sc.nextInt ( );
      w = sc.nextInt ( );
      if ( h == 0 && w == 0 )
        break ;
      
      for ( i = 0; i < h; ++i )
      {
        if ( i == 0 || i == h - 1 )
        {
          for ( j = 0; j < w; ++j )
            System.out.print ( "#" );
        }
        else
        {
          System.out.print ( "#" );
          for ( j = 1; j < w - 1; ++j )
            System.out.print ( "." );
          System.out.print ( "#" );
        }
        System.out.println ( );
      }
      System.out.println ( );
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