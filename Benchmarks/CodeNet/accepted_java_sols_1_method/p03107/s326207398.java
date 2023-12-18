import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int c0 = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') c0++;
    }
    int c1 = s.length() - c0;

    System.out.println(Math.min(c0, c1) * 2);
  }
}
