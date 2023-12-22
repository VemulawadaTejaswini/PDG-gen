import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();

    int appleToRemove = Math.max(1, Math.min(n, -l + 1));

    System.out.println((2 * l + n - 1) * n / 2 - (l + appleToRemove - 1));
  }
}