import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int X = Integer.parseInt(sc.next());

    int ans = 1;

    for (int i = 2; i < 32; i++) {
      int b = i;
      for (int p = 2; p < 10; p++) {
        b *= i;
        if (b <= X) {
          ans = Math.max(ans, b);
        } else {
          break;
        }
      }
    }

    System.out.println(ans);
  }
}