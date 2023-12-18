import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String[] lines = br.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);

      int i = 1;
      int x = 0;
      while( i <= n){
        if( i % 3 == 0) System.out.print(" " + i);
        else if( i % 10 == 3) System.out.print(" " + i);
        else {
          x = i;
          for( int j = 10; j < i; j *= 10){
            x /= j;
            if( x % 10 == 3) System.out.print(" " + i);
          }
        }
        i++;
      }
      System.out.println("");
    }
  }
}
