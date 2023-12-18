import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String[] lines = br.readLine().split(" ");
      int m = Integer.parseInt(lines[0]);
      int f = Integer.parseInt(lines[1]);
      int b = Integer.parseInt(lines[2]);

      if( b <= m ) System.out.println(0);
      else if( b <= m + f ) System.out.println(b - m);
      else System.out.println("NA");
    }
  }
}
