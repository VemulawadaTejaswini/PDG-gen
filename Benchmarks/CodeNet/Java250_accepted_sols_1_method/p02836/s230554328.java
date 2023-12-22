import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    char[] chars = a.toCharArray();

    int num = 0;
    for (int i = 0; i < a.length() / 2; i++) {
      if (chars[i] != chars[a.length() - i - 1]) {
        num++;
      }
    }
    System.out.println(num);
  }
}
