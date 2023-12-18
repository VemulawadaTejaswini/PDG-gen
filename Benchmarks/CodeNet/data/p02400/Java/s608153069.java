import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double r, area, cir;
    r = Integer.parseInt(br.readLine());
    area = r * r * Math.PI;
    cir = 2 * r * Math.PI;
    System.out.printf("%.6f %.6f", area, cir);
  }
}