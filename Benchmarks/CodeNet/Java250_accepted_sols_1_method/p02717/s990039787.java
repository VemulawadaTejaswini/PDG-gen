import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] split = reader.readLine().split(" ");
    int a = Integer.parseInt(split[0]);
    int b = Integer.parseInt(split[1]);
    int c = Integer.parseInt(split[2]);
    System.out.println(c + " " + a + " " + b);
  }
}
