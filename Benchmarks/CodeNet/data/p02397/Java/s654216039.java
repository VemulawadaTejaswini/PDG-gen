import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String[] lines;
      int x,y;

      while (true) {
        lines = br.readLine().split(" ");
        x = Integer.parseInt(lines[0]);
        y = Integer.parseInt(lines[1]);

        if(x==0 && y==0){ break; }

        if (x < y) {
          System.out.println(x + " " + y);
        } else {
          System.out.println(y + " " + x);
        }
      }
    }
  }
}
