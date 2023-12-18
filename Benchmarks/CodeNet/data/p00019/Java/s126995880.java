
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
      long n = Integer.parseInt(reader.readLine());
      for (long i = n - 1; i > 1; i--) {
        n *= i;
      }
      System.out.println(n);
  }

}