import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] s = in.readLine().split("/");
    System.out.println("2018/" + s[1] + "/" + s[2]);
  }
}