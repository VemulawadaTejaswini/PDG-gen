public class
Main
{
  private class
  Pair<T extends Comparable<T>,U extends Comparable<U>>
  implements Comparable<Pair<T,U>>
  {
    public final T x;
    public       U y;

    public
    Pair (
      final T x,
      final U y
      )
    {
      this.x = x;
      this.y = y;
    }

    public int
    compareTo (
      final Pair<T,U> obj
      )
    {
      if ( y.equals ( obj.y ) )
        return x.compareTo ( obj.x );
      return ( -y.compareTo ( obj.y ) );
    }
  }

  public void
  run (
    final java.util.Scanner sc,
    final java.io.PrintStream out
    )
  {
    java.util.PriorityQueue<Pair<Integer,Integer>> lis;
    java.util.List<Pair<Integer,Integer>> heap;
    int n, q;
    int i;

    n = sc.nextInt ( );
    q = sc.nextInt ( );

    lis  = new java.util.PriorityQueue<Pair<Integer,Integer>> ( );
    heap = new java.util.ArrayList<Pair<Integer,Integer>> ( n + 1 );
    heap.add ( null );
    for ( i = 1; i <= n; ++i )
    {
      heap.add ( new Pair<Integer,Integer> ( i, 0 ) );
      lis.add ( heap.get ( i ) );
    }

    for ( i = 0; i < q; ++i )
    {
      int a, v;

      a = sc.nextInt ( );
      v = sc.nextInt ( );
      lis.remove ( heap.get ( a ) );
      heap.get ( a ).y += v;
      lis.add ( heap.get ( a ) );
      System.out.println ( lis.peek ( ).x + " " + lis.peek ( ).y );
    }
  }

  public static void
  main (
    final String[ ] args
    )
  {
    ( new Main ( ) ).run ( new java.util.Scanner ( System.in ), System.out );
  }
}