
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int l[] = new int[m];
    int r[] = new int[m];

    for (int i = 0; i < m; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    int min = l[0];
    int max = r[0];

    for (int i = 1; i < m; i++) {
      min = Math.max(min, l[i]);
      max = Math.min(max, r[i]);
    }

    if (max - min < 0) {
      System.out.println(0);
    } else {
      System.out.println(max - min + 1);
    }
  }
}