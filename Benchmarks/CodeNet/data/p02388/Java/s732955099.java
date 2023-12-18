import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    try {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in), 1);
      int x = Integer.valueOf(input.readLine());
      if (1 <= x && x <= 100) {
        System.out.println(cubic(x));
      }
    } catch (Exception e) {
      System.exit(0);
    }

  }

  private static int cubic(int x) {
    return x * x * x;
  }
}