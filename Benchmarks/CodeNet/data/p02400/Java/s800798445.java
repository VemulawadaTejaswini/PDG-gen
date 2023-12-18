import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    while ((readStr = reader.readLine()) != null) {
      double[] list = new double[3];
      list[0] = Double.parseDouble(readStr.split(" ")[0]);
      double r = list[0];
      String a = String.format("%.5f", r*r*Math.PI);
      String b = String.format("%.5f", r*2*Math.PI);
      System.out.println(a + " " + b);
      break;
    }
  }

}