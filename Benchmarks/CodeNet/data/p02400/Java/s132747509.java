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
      System.out.println(r*r*Math.PI + " " + r*2*Math.PI);
      break;
    }
  }

}