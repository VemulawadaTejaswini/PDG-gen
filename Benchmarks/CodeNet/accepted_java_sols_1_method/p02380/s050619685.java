import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] params = br.readLine().split(" ");
      double a = Double.parseDouble(params[0]);
      double b = Double.parseDouble(params[1]);
      double C = Double.parseDouble(params[2]);

      double rC= Math.toRadians(C);
      double l = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(rC)) + a + b;
      double h = b * Math.sin(rC);
      double s = a * h / 2;

      System.out.printf("%.8f\n%.8f\n%.8f\n", s,l,h);
    }
  }
}
