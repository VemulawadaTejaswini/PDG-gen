import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
 
  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      StringBuilder result = new StringBuilder();
      String[] lines;
      int h,w;
      int i,j;

      while (true) {
        lines = br.readLine().split(" ");
        h = Integer.parseInt(lines[0]);
        w = Integer.parseInt(lines[1]);

        if(h==0 && w==0){ break; }

        for( i = 0; i < h; i++ ) {
          for( j = 0; j < w; j+=2 ) {
            if( i % 2 == 0 ){
               result.append("#.");
            } else {
              result.append(".#");
            }
          }
          if ( j > w)  result.delete(result.length()-1, result.length());
          result.append("\n");
        }

        System.out.println(result);

        result.setLength(0);
      }
    }
  }
}
