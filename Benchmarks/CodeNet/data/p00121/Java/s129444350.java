public class
Main
{
  static final int[ ][ ] swp = { { 1, 4 }, { 0, 2, 5 }, { 1, 3, 6 }, { 2, 7 }
                               , { 0, 5 }, { 1, 4, 6 }, { 2, 5, 7 }, { 3, 6 } };

  private void
  run (
    )
  {
    java.util.Map<String, Integer> rec = new java.util.TreeMap<String, Integer> ( );
    java.util.Queue<Status> lis = new java.util.LinkedList<Status> ( );
    java.util.Scanner sc = new java.util.Scanner ( System.in );
    int i;
  
    lis.add ( new Status ( new int[ ]{ 0, 1, 2, 3, 4, 5, 6, 7 }, 0 ) );
    while ( !lis.isEmpty ( ) )
    {
      final Status s = lis.remove ( );
      int zp;
      
      if ( rec.containsKey ( java.util.Arrays.toString ( s.st ) ) )
        continue ;

      rec.put ( java.util.Arrays.toString ( s.st ), s.vl );
      for ( zp = 0; s.st[ zp ] != 0; ++zp ) ;
      for ( i = 0; i < swp[ zp ].length; ++i )
      {
        int[ ] ns = s.st.clone ( );
        
        ns[ zp ] = ns[ swp[ zp ][ i ] ];
        ns[ swp[ zp ][ i ] ] = 0;
        lis.add ( new Status ( ns, s.vl + 1 ) );
      }
    }

    while ( sc.hasNextInt ( ) )
    {
      int[ ] d = new int[ 8 ];
      
      for ( i = 0; i < 8; ++i )
        d[ i ] = sc.nextInt ( );

      System.out.println ( rec.get ( java.util.Arrays.toString ( d ) ) );
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

  private class
  Status
  {
    int[ ] st;
    int    vl;

    Status (
      int[ ] st,
      int    vl
      )
    {
      this.st = st;
      this.vl = vl;
      
      return ;      
    }
  }
}