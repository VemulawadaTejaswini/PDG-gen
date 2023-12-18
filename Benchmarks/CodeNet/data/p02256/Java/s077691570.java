import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] str = br.readLine().split(" ");
      int x = Integer.parseInt( str[0] );
      int y = Integer.parseInt( str[1] );
      int z = calcRemaider(x, y);

      int[] aDiv,az;
      int result=0;

      aDiv = commonDivisor( x>y ? y : x );
      az = commonDivisor(z);
      for( int i=0, j=0, max = az.length; i<max; i++ ) {
        for( j=0; aDiv[j] <= az[i]; j++){
          if(aDiv[j] == az[i]) result = aDiv[j];
        }
      }

      System.out.println(result);
    }
  }

  static int[] commonDivisor(int n) {
    int[] div = new int[5000];
    int[] buf = new int[5000];
    int counter = 0;

    for(int i=1, j=0, max=n; i<max; i++){
      if( n%i == 0) {
        div[j++] = i;
        max = n/i;
        buf[++counter] = max;
      }
    }
    int[] ret = new int[(counter)*2];
    for(int i=0 ; i != counter; i++){
      ret[i] = div[i];
      ret[counter + i] = buf[counter-i];
    }

    return ret;
  }

  static int calcRemaider(int x, int y) {
    int z = x>y ? x%y : y%x;

    if( x > y &&  z == 0 ) {
      System.out.println(y);
      System.exit(0);

    } else if( z == 0 ) {
      System.out.println(x);
      System.exit(0);
    }

    return z;
  }
}
