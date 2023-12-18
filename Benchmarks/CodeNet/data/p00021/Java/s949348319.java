
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    int count = Integer.parseInt(reader.readLine());

    for (int i = 0; i < count; i++) {
      String[] strs = reader.readLine().split(" ");
      float x1, x2, x3, x4, y1, y2, y3, y4;
      x1 = Float.parseFloat(strs[0]);
      y1 = Float.parseFloat(strs[1]);
      x2 = Float.parseFloat(strs[2]);
      y2 = Float.parseFloat(strs[3]);
      x3 = Float.parseFloat(strs[4]);
      y3 = Float.parseFloat(strs[5]);
      x4 = Float.parseFloat(strs[6]);
      y4 = Float.parseFloat(strs[7]);

      double lineAAngle = Math.atan2(y2 - y1, x2 - x1);
      double lineBAngle = Math.atan2(y4 - y3, x4 - x3);

      if (lineAAngle == lineBAngle)
        System.out.println("YES");
      else
        System.out.println("NO");

    }
  }

}