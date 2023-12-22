import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    String w1 = sc.next();
    String w2 = sc.next();

    int c = 0;
    for (int i = 0; i < w1.length(); i++) {
      if (w1.charAt(i) == w2.charAt(i)) {
        c++;
      }
    }

    System.out.println(c);
  }
}
