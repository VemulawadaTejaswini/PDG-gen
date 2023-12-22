import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      double a = Math.pow(Double.parseDouble(s.split(" ")[0]),2);
      double b = Math.pow(Double.parseDouble(s.split(" ")[1]),2);
      double c = Math.pow(Double.parseDouble(s.split(" ")[2]),2);

      if( a + b == c ){
        System.out.println("YES");
      } else if ( a + c == b) {
        System.out.println("YES");
      } else if ( b + c == a) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}