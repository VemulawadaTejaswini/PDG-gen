
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int h[] = new int[n];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    Arrays.sort(h);

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n - k + 1; i++) {
      min = Math.min(h[i + k - 1] - h[i], min);
    }
    System.out.println(min);
  }
}