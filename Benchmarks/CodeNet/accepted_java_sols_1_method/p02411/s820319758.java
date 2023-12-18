import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    while(true) {
      String[] strArray = br.readLine().split(" ");
      int m = Integer.parseInt(strArray[0]);
      int f = Integer.parseInt(strArray[1]);
      int r = Integer.parseInt(strArray[2]);
      int d = m + f;
      if(m == -1 && f == -1 && r == -1) {
        break;
      }
      else if(m == -1 || f == -1) {
        sb.append("F").append("\n");
      }
      else if(d >= 80) {
        sb.append("A").append("\n");
      }
      else if(d >= 65 && d < 80) {
        sb.append("B").append("\n");
      }
      else if(d >= 50 && d < 65) {
        sb.append("C").append("\n");
      }
      else if(d >= 30 && d < 50) {
        if(r >= 50) {
          sb.append("C").append("\n");
        }
        else {
          sb.append("D").append("\n");
        }
      }
      else {
        sb.append("F").append("\n");
      }
    }
    System.out.print(sb);
  }
}