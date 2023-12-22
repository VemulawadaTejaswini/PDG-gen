import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strArray = new String[2];
    StringBuilder sb = new StringBuilder();
    String line;
    while (true) {
      line = br.readLine();
      strArray = line.split(" ");
      int h = Integer.parseInt(strArray[0]);
      int w = Integer.parseInt(strArray[1]);
      if(h == 0 && w == 0) {
        break;
      }
      for (int i = 0;i < h;i++) {
        for (int f = 0;f < w;f++) {
          sb.append("#");
        }
        sb.append("\n");
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}