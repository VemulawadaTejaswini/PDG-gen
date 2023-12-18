import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.close();

    if (N <= M) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}