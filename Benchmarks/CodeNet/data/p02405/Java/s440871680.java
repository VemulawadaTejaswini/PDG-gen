import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strArray = new String[2];
    int h, w;
    StringBuilder sb = new StringBuilder();
    while(true) {
      strArray = br.readLine().split(" ");
      h = Integer.parseInt(strArray[0]);
      w = Integer.parseInt(strArray[1]);
      if (h == 0 && w == 0) {
        break;
      }
      for(int i = 0;i < h;i++) {
        for(int j = 0;j < w;j++) {
          if(i % 2 == 0) {
            if (j % 2 == 0) {
              sb.append("#");
            }else {
              sb.append(".");
            }
          }else {
            if(j % 2 == 0) {
              sb.append(".");
            }else {
              sb.append("#");
            }
          }
        }
        sb.append("\n");
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}