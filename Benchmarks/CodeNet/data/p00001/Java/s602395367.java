public class
Main
{
  public static void
  main (
    String[ ] args
    )
  {
    java.util.Queue<Integer> lis
      = new java.util.PriorityQueue<Integer> ( 16,
          new java.util.Comparator<Integer> ( )
          {
            public int
            compare (
              Integer a,
              Integer b
              )
            {
              return ( b - a );
            }
          } );
    java.util.Scanner cin = new java.util.Scanner ( System.in );
    int i;

    for ( i = 0; i < 10; ++i )
    {
      lis.add ( new Integer ( cin.nextInt ( ) ) );
    }
    for ( i = 0; i < 3; ++i )
    {
      System.out.println ( lis.poll ( ) );
    }

    return ;
  }
}