import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();

    int p[] = new int[n];
    for (int i = 0; i < q; i++) {
      int ans = sc.nextInt();
      p[ans - 1] = p[ans - 1] + 1;
    }

    for (int i = 0; i < n; i++) {
      if ((p[i] + k - q) > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
