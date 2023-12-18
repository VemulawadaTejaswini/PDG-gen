import java.util.*;

public class Main {

  private static void solve(int n) {
    System.out.println(n % 1_000 > 0 ? 1_000 - n % 1_000 : 0);
  }

  public static void main(String[] args) {
    int n = scanner.nextInt();
    solve(n);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
