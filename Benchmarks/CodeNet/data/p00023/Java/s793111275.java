
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static final int alphabet_num = 'z' - 'a';

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    /*
     String in;
     while ((in = reader.readLine()) != null) {

     }
     */
    int dataNum = Integer.valueOf(reader.readLine());
    for (int i = 0; i < dataNum; i++) {
      String[] in = reader.readLine().split(" ");
      double xA = Float.valueOf(in[0]);
      double yA = Float.valueOf(in[1]);
      double rA = Float.valueOf(in[2]);
      double xB = Float.valueOf(in[3]);
      double yB = Float.valueOf(in[4]);
      double rB = Float.valueOf(in[5]);
      double distance = Math.sqrt(Math.pow(yB - yA, 2) + Math.pow(xB - xA, 2));

      if (distance > Math.sqrt(Math.pow(rA + rB, 2)))
        System.out.println("0");

      if (rB < rA) {
        if (distance < rA - rB)
          System.out.println("2");
        else if (distance <= rA + rB)
          System.out.println("1");
      } else {
        if (distance < rB - rA)
          System.out.println("-2");
        else if (distance <= rB + rA)
          System.out.println("1");
      }

    }
  }

}