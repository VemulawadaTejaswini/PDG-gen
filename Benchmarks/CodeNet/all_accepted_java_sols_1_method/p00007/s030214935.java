import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    double sum = 100000;

    for (int i = 0;i < n; i++) {
      sum = (1000 * Math.ceil((sum * 1.05) * 0.001));
    }

    System.out.println((int)sum);
  }
}