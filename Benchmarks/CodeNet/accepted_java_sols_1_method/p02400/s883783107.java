import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    double r = Double.parseDouble(buf.readLine());
    double pi = 3.141592653589;
    System.out.printf("%.6f %.6f\n", pi*r*r, 2*pi*r);
  }
}