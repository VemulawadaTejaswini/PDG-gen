import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    char[] c = str.toCharArray();
    Arrays.sort(c);
    System.out.println(c[0]==c[1] && c[1] != c[2] && c[2] == c[3] ?"Yes":"No");
  }
}
    