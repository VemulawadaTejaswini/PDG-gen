import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int len = String.valueOf(n).length();
    int res = 0;
    for (int i = 1; i < len; i += 2) {
      res += 9 * (int) Math.pow(10, i - 1);
    }

    if (len % 2 == 1) {
      res += n - (int) Math.pow(10, len - 1) + 1;
    }

    System.out.println(res);
  }
}