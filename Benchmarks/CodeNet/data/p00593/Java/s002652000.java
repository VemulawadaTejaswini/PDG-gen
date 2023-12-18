import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int input = Integer.parseInt(reader.readLine());

    int cases = 1;

    while(input>0) {
      int[][] arr = new int[input][input];
      int x=0,y=0;
      int count = 1;
      boolean mode = false;
      while(x<input&&y<input) {
        arr[x][y] = count;

        if(mode) {
          x--;  y++;
        }else {
          y--;  x++;
        }

        if(x>=input) {
          x--;  y++;  y++;
          mode = !mode;
        }else if(y>=input) {
          y--;  x++;  x++;
          mode = !mode;
        }

        if(x<0) {
          x++;
          mode = !mode;
        }else if(y<0) {
          y++;
          mode = !mode;
        }

        count++;
      }

      sb.append("Case "+cases+":\n");

      for(int i = 0; i < input; i++) {
        for(int j = 0; j < input; j++) {
          sb.append(String.format("%3d",arr[j][i]));
        }
        sb.append("\n");
      }

      input = Integer.parseInt(reader.readLine());
      cases++;
    }

    System.out.print(sb.toString());
  }
}