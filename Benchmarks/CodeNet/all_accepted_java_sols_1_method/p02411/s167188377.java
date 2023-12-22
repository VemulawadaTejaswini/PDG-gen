import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String[] lines;
      int m,f,r,sum;

      do {

        lines = br.readLine().split(" ");
        m = Integer.parseInt(lines[0]);
        f = Integer.parseInt(lines[1]);
        r = Integer.parseInt(lines[2]);
        sum = m + f;

        if ( m == -1 && f == -1 && r == -1) break;
        else if( m == -1 || f == -1 ) {
          System.out.println("F");
          continue;
        }

        if ( sum >= 80 ) System.out.println("A");
        else if ( sum >= 65 ) System.out.println("B");
        else if ( sum >= 50 ) System.out.println("C");
        else if ( sum >= 30 ) {
          if ( r >= 50 ) System.out.println("C");
          else System.out.println("D");
        } else System.out.println("F");
      } while( br.ready() );
    }
  }
}
