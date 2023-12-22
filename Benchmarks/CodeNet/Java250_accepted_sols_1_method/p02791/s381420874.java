import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 要素数
    int inputs = sc.nextInt();

    // 配列に格納された要素1つ1つについて、条件を満たさないものをカウントする
    int num;
    int count = 1;
    int min = sc.nextInt();
    for (int i = 1; i < inputs; i++) {
      num = sc.nextInt();
      if (min > num) {
        min = num;
      }
      if (min == num) {
        count++;
      }
    }
    System.out.println(count);
  }
}
