
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
      float xA = Float.valueOf(in[0]);
      float yA = Float.valueOf(in[1]);
      float xB = Float.valueOf(in[2]);
      float yB = Float.valueOf(in[3]);
      float xC = Float.valueOf(in[4]);
      float yC = Float.valueOf(in[5]);
      float xD = Float.valueOf(in[6]);
      float yD = Float.valueOf(in[7]);
      float slopeOfLineAtoB = (yB - yA) / (xB - xA);
      float slopeOfLineCtoD = (yD - yC) / (xD - xC);
      if (slopeOfLineAtoB == slopeOfLineCtoD)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }

}