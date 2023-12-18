import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

      String line = buf.readLine();
      double a = Double.parseDouble(line.split(" ")[0]);
      double b = Double.parseDouble(line.split(" ")[1]);
      double C = Double.parseDouble(line.split(" ")[2]);
      double rad = Math.toRadians(C);
      double C_sin = Math.sin(rad);
      double C_cos = Math.cos(rad);
      double S = (1/2)*a*b*C_sin;
      double L = a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*C_cos);
      double h = b*C_sin;
      System.out.println(S);
      System.out.println(L);
      System.out.println(h);
    }
  }