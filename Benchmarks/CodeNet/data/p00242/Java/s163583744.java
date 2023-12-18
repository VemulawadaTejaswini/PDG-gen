public class
Main
{
  public void
  run (
    final java.io.BufferedReader in,
    final java.io.PrintStream out
    )
  throws java.io.IOException
  {
    int i;

    for ( ; ; )
    {
      java.util.List<Pair<String,Integer>> lis;
      java.util.Map<String,Integer> h;
      char ch;
      int n;

      n = ( new java.util.Scanner ( in.readLine ( ) ) ).nextInt ( );
      if ( n == 0 ) break ;

      h = new java.util.HashMap<String,Integer> ( );
      for ( i = 0; i < n; ++i )
      {
        final java.util.StringTokenizer tok = new java.util.StringTokenizer ( in.readLine ( ) );

        while ( tok.hasMoreTokens ( ) )
        {
          final String t = tok.nextToken ( );

          if ( h.containsKey ( t ) )
            h.put ( t, h.get ( t ) + 1 );
          else
            h.put ( t, 1 );
        }
      }

      lis = new java.util.LinkedList<Pair<String,Integer>> ( );
      for ( java.util.Iterator<String> it = h.keySet ( ).iterator ( ); it.hasNext ( ); )
      {
        final String key = it.next ( );

        lis.add ( new Pair<String,Integer> ( key, h.get ( key ) ) );
      }
      java.util.Collections.sort ( lis );

      i = 0;
      ch = in.readLine ( ).charAt ( 0 );
      for ( java.util.Iterator<Pair<String,Integer>> it = lis.iterator ( ); it.hasNext ( ) && i < 5; )
      {
        final Pair<String,Integer> p = it.next ( );

        if ( p.key.charAt ( 0 ) == ch )
        {
          if ( i > 0 )
            out.print ( " " );
          out.print ( p.key );
          ++i;
        }
      }
      out.println ( i == 0 ? "NA" : "" );
    }
  }

  public static void
  main (
    final String[ ] args
    )
  {
    try
    {
      ( new Main ( ) ).run ( new java.io.BufferedReader ( new java.io.InputStreamReader ( System.in ) ), System.out );
    }
    catch ( Exception e ) { }
  }

  private class
  Pair<K extends Comparable<K>, V extends Comparable<V>>
  implements Comparable<Pair<K,V>>
  {
    public final K key;
    public final V value;

    public
    Pair (
      K key,
      V value
      )
    {
      this.key   = key;
      this.value = value;
    }

    public int
    compareTo (
      Pair<K,V> obj
      )
    {
      if ( this.value.equals ( obj.value ) )
        return ( this.key.compareTo ( obj.key ) );
      return ( obj.value.compareTo ( this.value ) );
    }
  }
}