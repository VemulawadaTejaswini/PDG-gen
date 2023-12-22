import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    // 判定の出力
    if (a-b == b-c || c-b == b-a) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}