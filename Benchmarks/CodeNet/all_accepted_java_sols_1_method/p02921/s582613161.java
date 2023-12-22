import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();
    int count = 0;
    for (int i = 0; i < 3; i++) {
      if (s[i] == t[i]) count++;
    }
    System.out.println(count);
  }
}
