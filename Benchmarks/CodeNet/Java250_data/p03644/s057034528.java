import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = 0;; i++) {
      if (Math.pow(2, i) <= n) {
        continue;
      } else {
        System.out.println((int) Math.pow(2, i - 1));
        return;
      }
    }

  }
}