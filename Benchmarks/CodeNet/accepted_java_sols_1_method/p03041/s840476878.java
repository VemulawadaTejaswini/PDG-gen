import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    s[K - 1] = Character.toLowerCase(s[K - 1]);
    System.out.println(new String(s));
  }
}
