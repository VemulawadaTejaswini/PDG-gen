import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main{

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      int[][][] rooms = new int[4][3][10];
      for( int i = 0; i < 4; i++ ) {
        for( int j = 0; j < 3; j++ ) {
          Arrays.fill(rooms[i][j], 0);
        }
      }
      String[] lines = br.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int b,f,r,v;

      for(int i = 0; i < n; i++) {
        lines = br.readLine().split(" ");
        b = Integer.parseInt(lines[0]) - 1;
        f = Integer.parseInt(lines[1]) - 1;
        r = Integer.parseInt(lines[2]) - 1;
        v = Integer.parseInt(lines[3]) - 1;
        rooms[b][f][r] += v;
      }

      StringBuilder result = new StringBuilder(400);
      String sep = "####################\n";
      for(int i = 0; i < 4; i++ ) {
        for( int j = 0; j < 3; j++ ) {
          for( int k = 0; k < 10; k++ ){
            result.append(" " +rooms[i][j][k]);
          }
          result.append("\n");
        }
        if( i != 3) result.append(sep);
      }
      System.out.print(result);
    }
  }
}
