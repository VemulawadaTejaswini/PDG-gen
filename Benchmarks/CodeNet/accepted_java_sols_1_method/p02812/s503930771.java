import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 文字数
    int a = sc.nextInt();
    // 文字数
    String b = sc.next();

    char[] c = b.toCharArray();

    int result = 0;
    for (int i = 0; i < a - 2; i++) {
      if (c[i] == 'A' && c[i + 1] == 'B' && c[i + 2] == 'C') {
        result++;
      }
    }
    System.out.println(result);
  }
}
