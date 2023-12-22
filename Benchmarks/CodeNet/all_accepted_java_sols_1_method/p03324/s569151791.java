import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    int a = 1;

    for (int i = 0; i < d; i++) {
      a *= 100;
    }

    if (n == 100) {
      System.out.println(a * (n+1));
      return;
    }

    System.out.println(a * n);
  }
}
