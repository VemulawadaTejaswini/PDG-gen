import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 整数A、B、Cがスペース区切りで与えられるので、それを受け取る
    int A = sc.nextInt(); // スペースまでを整数として読込
    int B = sc.nextInt();
    int C = sc.nextInt();

    // A、B、Cに5が2つ、7が1つ含まれてる場合のみ
    // A * B * C = 5 * 5 * 7になる
    int product = 5 * 5 * 7;

    // A * B * Cがproductと一致するか判定
    if(A * B * C == product) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}