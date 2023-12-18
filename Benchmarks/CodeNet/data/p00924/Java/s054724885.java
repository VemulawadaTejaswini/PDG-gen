public class Main {

  String p( int i ) {
    return String.format( "%16s", Integer.toBinaryString( i ) ).replace( " ", "0" );
  }

  int getbit( int[] b ) {
    int bit = 0;
    for( int i = 0; i < b.length; i++ ) {
      bit |= ( b[ i ] & 1 );
      if( i != b.length - 1 ) {
        bit <<= 1;
      }
    }
    return bit;
  }

  int[] bit2int( int b, int n ) {
    int bit = b;
    int[] ar = new int[ n ];
    for( int i = n - 1; i >= 0; i-- ) {
      ar[ i ] = bit % 2;
      bit /= 2;
    }
    return ar;
  }

  int getReq( int[] req, int[] opt, int first ) {
    int tmp = first;
    int bit = 0;
    for( int i = 0; i < req.length; i++ ) {
      for( int j = 0; j < req[ i ]; j++ ) {
        bit |= tmp;
        bit <<= 1;
      }
      tmp = ( tmp == 0 ? 1 : 0 );
    }
    bit >>= 1;
    return opt[ bit ];
  }

  void run(
      java.io.InputStream in,
      java.io.PrintStream out
      ) {
    java.util.Scanner sc = new java.util.Scanner( in );
    int[] opt = new int[ 65536 ];

    java.util.Arrays.fill( opt, Integer.MAX_VALUE );

    java.util.LinkedList<Integer> q =
      new java.util.LinkedList<Integer>();

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] b = new int[ n ];
    int[] req = new int[ m ];
    for( int i = 0; i < n; i++ ) {
      b[ i ] = sc.nextInt();
    }
    for( int i = 0; i < m; i++ ) {
      req[ i ] = sc.nextInt();
    }

    opt[ getbit( b ) ] = 0;
    q.add( getbit( b ) );
//    out.println( "opt[" + p( getbit( b ) ) + "]: 0" );

    while( !q.isEmpty() ) {
      int pbt = q.poll();
      b = bit2int( pbt, n );

      // b[ i ] <--> b[ i + 1 ]
      for( int i = 0; i < n - 1; i++ ) {
        int tmp = b[ i + 1 ];
        b[ i + 1 ] = b[ i ];
        b[ i ] = tmp;

        int[] b2 = java.util.Arrays.copyOf( b, b.length );
        int bt = getbit( b2 );

        if( opt[ bt ] == Integer.MAX_VALUE ) {
//          out.println( "opt[" + p( bt ) + "]: " + ( opt[ pbt ] + 1 ) );
          opt[ bt ] = opt[ pbt ] + 1;
          q.add( bt );
        }

        tmp = b[ i + 1 ];
        b[ i + 1 ] = b[ i ];
        b[ i ] = tmp;
      }
    }

    int req0 = getReq( req, opt, 0 );
    int req1 = getReq( req, opt, 1 );
    out.println( Math.min( req0, req1 ) );

  }

  public static void main( String[] args ) {
    new Main().run( System.in, System.out );
  }

}