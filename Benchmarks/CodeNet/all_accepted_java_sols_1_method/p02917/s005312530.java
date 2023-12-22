
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      b[i] = sc.nextInt();
    }
    Arrays.fill(a, Integer.MAX_VALUE);

    for (int i = 0; i < n - 1; i++) {
      a[i] = Math.min(a[i], b[i]);
      a[i + 1] = Math.min(a[i + 1], b[i]);
    }

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
    System.out.println(sum);
  }
}
