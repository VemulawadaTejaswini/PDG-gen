import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] str = br.readLine().split(" ");
      int x = Integer.parseInt( str[0] );
      int y = Integer.parseInt( str[1] );

      System.out.println( gcd(x,y) );
    }
  }

  static int gcd(int x, int y) {
    if( x<y ){
      int tmp = x; x = y; y = tmp;
    }

    int r;
    while( y>0 ) {
      r = x%y;
      x = y; y = r;
    }

    return x;
  }
}
