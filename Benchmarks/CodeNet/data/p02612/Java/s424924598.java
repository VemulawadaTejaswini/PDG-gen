import java.util.*;

public class TaskA {

  private static void solve(int n) {
    System.out.println(n % 1000);
  }

  public static void main(String[] args) {
    int n = scanner.nextInt();
    solve(n);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
