import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    if (N % 2 == 1) {
      System.out.println("No");
      return;
    }
    for (int i = 0; i < N / 2; i++) {
      if (s[i] != s[i + N / 2]) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
