import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int k = Integer.parseInt(str[0]);
    int x = Integer.parseInt(str[1]);
    System.out.println(500 * k >= x ? "Yes":"No");
  }
}