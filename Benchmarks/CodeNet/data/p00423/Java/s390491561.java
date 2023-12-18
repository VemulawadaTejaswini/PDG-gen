import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n,a,b,sumA,sumB;
      // String[] lines;
      String line;
      StringBuilder buf = new StringBuilder();
      while (true) {
        n = parseInt(br.readLine());
        if( n == 0 ) break;

        sumA = sumB = 0;
        for(int i=0; i<n; i++) {
          // lines = br.readLine().split(" ");
          // a = parseInt(lines[0]);
          // b = parseInt(lines[1]);
          line = br.readLine();
          a = Character.getNumericValue(line.charAt(0));
          b = Character.getNumericValue(line.charAt(2));
          if(a > b)
            sumA += (a+b);
          else if(b > a)
            sumB += (a+b);
          else
            { sumA += a; sumB += b; }
        }
        buf.append(sumA).append(" ").append(sumB).append("\n");
      }
      System.out.print(buf);
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }
}
