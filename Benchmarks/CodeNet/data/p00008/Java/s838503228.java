import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String bl = "";
    while ((bl = br.readLine()) != null) {
      int n = Integer.parseInt(bl);
      int counter = 0;
      for (int a = 1; a < 10; a++) {
        for (int b = 1; b < 10; b++) {
          for (int c = 1; c < 10; c++) {
            for (int d = 1; d < 10; d++) {
              if ((a + b + c + d) == n) { counter++;}
            }
          }
        }
      }
      System.out.println(counter);
    }
  }
}