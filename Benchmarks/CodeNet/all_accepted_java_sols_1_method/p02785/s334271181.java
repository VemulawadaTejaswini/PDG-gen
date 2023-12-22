import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    Long h[] = new Long[n];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextLong();
    }

    Arrays.sort(h, Collections.reverseOrder());

    long sum = 0;
    for (int i = k; i < n; i++) {
      sum += h[i];
    }

    System.out.println(sum);
  }
}
