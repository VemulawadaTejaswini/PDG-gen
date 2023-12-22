
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in;
    while ((in = reader.readLine()) != null) {
      int d = Integer.parseInt(in);
      int x = 600;
      int count = x / d;
      int result = 0;
      for (int i = 0; i < count; i++) {
        result += d * Math.pow(d * i, 2);
      }
      System.out.println(result);
    }
  }

}