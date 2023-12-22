import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    long h = sc.nextLong();

    if (h == 1) {
      System.out.println(1);
      return;
    }
    // n段のピラミッド
    long cnt = 1;
    while (h / 2 > 1) {
      h = h / 2;
      cnt++;
    }

    Double d = 0d;
    for (long i = 0; i < cnt + 1; i++) {
      d += Math.pow(2, i);
    }
    System.out.println(d.longValue());
  }
}
