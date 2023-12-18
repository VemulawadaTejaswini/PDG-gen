import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 
public class Main {

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      String line = null;
      List<String> list = new ArrayList<>();
      String[] lines;
      double a,b,c,d,e,f;
      double x,y;

      while(true) {

        line = br.readLine();
        list.add(line);
        if ( line == null ) break;
      }

      for(String l:list) {

        lines = l.split(" ");
        a = Integer.parseInt(lines[0]);
        b = Integer.parseInt(lines[1]);
        c = Integer.parseInt(lines[2]);
        d = Integer.parseInt(lines[3]);
        e = Integer.parseInt(lines[4]);
        f = Integer.parseInt(lines[5]);

        y = (f-(d*c/a)) / (e-(d*b/a));
        x = (f-(e*c/b)) / (d-(a*e/b));

        System.out.printf("%.3f %.3f\n", x,y);

      }
    }
  }
}
