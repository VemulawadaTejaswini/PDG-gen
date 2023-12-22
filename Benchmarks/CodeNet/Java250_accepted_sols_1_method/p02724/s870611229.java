import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int x = in.nextInt();
    int ans = 0;
    while (x >= 500) {
      ans += 1000;
      x -= 500;
    }
    while (x >= 5) {
      ans += 5;
      x -= 5;
    }
    System.out.println(ans);
  }
}
