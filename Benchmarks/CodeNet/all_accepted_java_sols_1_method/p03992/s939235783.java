import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    for (int i = 0; i < s.length; i++) {
      System.out.print(s[i]);
      if (i == 3) System.out.print(' ');
    }
    System.out.println();
  }
}
