import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] c1 = in.readLine().split("");
    String[] c2 = in.readLine().split("");
    if(c1[0].equals(c2[2]) && c1[1].equals(c2[1]) && c1[2].equals(c2[0]))
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}