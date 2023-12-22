import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final String[] s = new String[3];
    s[0] = scanner.nextLine();
    s[1] = scanner.nextLine();
    s[2] = scanner.nextLine();

    final int[] idx = new int[3];
    int nextTurn = 0;
    while (idx[nextTurn] < s[nextTurn].length()) {
      final char c = s[nextTurn].charAt(idx[nextTurn]);
      idx[nextTurn]++;

      nextTurn = c - 'a';
    }

    System.out.println(Character.toUpperCase((char) (nextTurn + 'a')));
  }
}