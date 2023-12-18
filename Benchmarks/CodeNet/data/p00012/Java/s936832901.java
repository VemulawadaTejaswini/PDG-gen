
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    double x1, x2, x3, x4, y1, y2, y3, y4;

    while ((readStr = reader.readLine()) != null) {
      String[] strs = readStr.split(" ");
      x1 = Double.parseDouble(strs[0]);
      y1 = Double.parseDouble(strs[1]);
      x2 = Double.parseDouble(strs[2]);
      y2 = Double.parseDouble(strs[3]);
      x3 = Double.parseDouble(strs[4]);
      y3 = Double.parseDouble(strs[5]);
      x4 = Double.parseDouble(strs[6]);
      y4 = Double.parseDouble(strs[7]);
      double p1_p4_angle = Math.abs(Math.toDegrees(Math.atan2(y4 - y1, x4 - x1)));
      double p2_p4_angle = Math.abs(Math.toDegrees(Math.atan2(y4 - y2, x4 - x2)));
      double p3_p4_angle = Math.abs(Math.toDegrees(Math.atan2(y4 - y3, x4 - x3)));
      
      if (!(p1_p4_angle > 179.9999 || p2_p4_angle > 179.9999 || p3_p4_angle > 179.9999))
        System.out.println("YES");
      else
        System.out.println("NO");
    }

  }

}