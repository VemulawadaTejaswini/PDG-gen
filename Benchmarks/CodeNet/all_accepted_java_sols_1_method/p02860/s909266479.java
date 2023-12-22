import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    final int n = Integer.parseInt(sc.next());
    final String str = sc.next();
    if (n % 2 == 1) {
      System.out.println("No");
      return;
    }

    final String halfStr = str.substring(0, n / 2);
    final String answer = str.equals(halfStr + halfStr) ? "Yes" : "No";
    System.out.println(answer);
  }
}