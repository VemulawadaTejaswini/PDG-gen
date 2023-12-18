public
class Main
{
  private static
  final int ColorNum = 6;

  public static
  void main (
    String args[ ]
    )
  {
    java.util.Scanner scanner
      = new java.util.Scanner ( System.in );

    while ( true )
    {
      int[ ][ ] panel;
      int       h, w, c;

      h = scanner.nextInt ( );
      w = scanner.nextInt ( );
      c = scanner.nextInt ( );
      if ( h == 0 && w == 0 && c == 0 ) break;

      panel = new int[ h ][ w ];
      for ( int j = 0; j < h; ++j )
      for ( int i = 0; i < w; ++i )
      {
        panel[ j ][ i ] = scanner.nextInt ( );
      }

      System.out.format ( "%d\n", solve ( panel, c ) );
    }

    return ;
  }

  public static
  int solve (
    int[ ][ ]   panel,
    int         c
    )
  {
    int[ ]  p = new int[ 5 ];
    int     res = 0;

    p[ 4 ] = c;
    for ( p[ 0 ] = 1; p[ 0 ] <= ColorNum; ++p[ 0 ] )
    for ( p[ 1 ] = 1; p[ 1 ] <= ColorNum; ++p[ 1 ] )
    for ( p[ 2 ] = 1; p[ 2 ] <= ColorNum; ++p[ 2 ] )
    for ( p[ 3 ] = 1; p[ 3 ] <= ColorNum; ++p[ 3 ] )
    {
      int[ ][ ] clone
        = new int[ panel.length ][ ];

      /* Copies panel to clone by deep copy */
      for ( int i = 0; i < panel.length; ++i )
      {
        clone[ i ] = panel[ i ].clone ( );
      }

      res = Math.max ( res, test ( clone, p ) );
    }

    return ( res );
  }

  private static
  int test (
    int[ ][ ]   panel,
    int[ ]      param
    )
  {
    for ( int c : param )
    {
      simulate ( panel, 0, 0, panel[ 0 ][ 0 ], c );
    }

    return
      count ( panel, 0, 0, panel[ 0 ][ 0 ] );
  }

  private static
  void simulate (
    int[ ][ ]   panel,
    int         x,
    int         y,
    int         pc,
    int         nc
    )
  {
    if ( nc == pc )               return ;
    if ( x < 0 || y < 0
      || y >= panel.length
      || x >= panel[ y ].length ) return ;
    if ( panel[ y ][ x ] != pc )  return ;

    panel[ y ][ x ] = nc;

    simulate ( panel, x - 1 , y     , pc, nc );
    simulate ( panel, x     , y - 1 , pc, nc );
    simulate ( panel, x + 1 , y     , pc, nc );
    simulate ( panel, x     , y + 1 , pc, nc );

    return ;
  }

  private static
  int count (
    int[ ][ ]   panel,
    int         x,
    int         y,
    int         c
    )
  {
    int res;

    if ( x < 0 || y < 0
      || y >= panel.length
      || x >= panel[ y ].length ) return ( 0 );
    if ( panel[ y ][ x ] != c )   return ( 0 );

    /* Flags not to recount this point */
    panel[ y ][ x ] = -1;

    res  = 1;
    res += count ( panel, x - 1 , y     , c );
    res += count ( panel, x     , y - 1 , c );
    res += count ( panel, x + 1 , y     , c );
    res += count ( panel, x     , y + 1 , c );

    return ( res );
  }
}