import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String s = in.next();
    if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
      System.out.println("Yes");
    } else System.out.println("No");
  }
}
