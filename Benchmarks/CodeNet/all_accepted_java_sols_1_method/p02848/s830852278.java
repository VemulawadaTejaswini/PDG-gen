import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    StringBuilder sb = new StringBuilder();
    for (char c : s) sb.append((char) ((c - 'A' + N) % 26 + 'A'));
    System.out.println(sb.toString());
  }
}
