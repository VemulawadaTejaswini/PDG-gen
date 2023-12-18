import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int r[] = new int[n];
    for (int i = 0; i < n; i++) {
      r[i] = sc.nextInt();
    }

    int min = r[0];
    int sabun = Integer.MIN_VALUE;
    for (int i = 1; i < n; i++) {
      sabun = Math.max(sabun, r[i] - min);
      min = Math.min(min, r[i]);
    }

    System.out.println(sabun);
  }
}
