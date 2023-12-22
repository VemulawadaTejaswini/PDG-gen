
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    Integer sum = 0;
    if (a >= k) {
      sum = k;
    } else {
      sum = a;
      k = k - a - b;
      sum -= Math.min(c, k);
    }

    // 出力
    System.out.println(sum);
  }
}
