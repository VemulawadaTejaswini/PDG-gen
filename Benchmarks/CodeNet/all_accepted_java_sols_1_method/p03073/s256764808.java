import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int min = s.length;
    for (int i = 0; i < 2; i++) {
      int cnt = 0;
      for (int j = 0; j < s.length; j++) {
        if (s[j] - '0' + Math.abs(i - j % 2) == 1) cnt++;
      }
      min = Math.min(min, cnt);
    }
    System.out.println(min);
  }
}
