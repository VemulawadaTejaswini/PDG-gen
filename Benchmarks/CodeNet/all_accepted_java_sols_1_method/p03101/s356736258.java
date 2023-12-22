import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int h = Integer.parseInt(str[0]);
    int w = Integer.parseInt(str[1]);
    str = in.readLine().split(" ");
    int h_sm = Integer.parseInt(str[0]);
    int w_sm = Integer.parseInt(str[1]);
    System.out.println((h-h_sm)*(w-w_sm));
  }
}