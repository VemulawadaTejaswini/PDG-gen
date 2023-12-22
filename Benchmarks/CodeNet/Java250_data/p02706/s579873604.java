
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int N = sc.nextInt();
    int M = sc.nextInt();

    for (int i = 0; i < M; i++) {
      int ai = sc.nextInt();
      N = N - ai;
    }

    // 出力
    System.out.println(N < 0 ? -1 : N);
  }
}
