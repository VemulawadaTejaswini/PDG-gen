import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 111;

    while (true) {
      if (((ans - 111) < n) && (n <= ans)) {
        System.out.println(ans);
        return;
      } else {
        ans += 111;
      }
    }

  }
}