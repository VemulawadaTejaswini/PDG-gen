import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] param = input.split(" ");

    int x = Integer.parseInt(param[0]);
    double r = Math.pow(x, 3);
    System.out.println(r);
  }
}