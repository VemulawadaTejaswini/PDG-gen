import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();

    int num = 0;
    for (int i = 0; i < s.length; i++) {
      char c = s[i];
      if (i % 2 == 0) num -= c == 'g' ? 0 : 1;
      else num += c == 'g' ? 1 : 0;
    }
    System.out.println(num);
  }
}
