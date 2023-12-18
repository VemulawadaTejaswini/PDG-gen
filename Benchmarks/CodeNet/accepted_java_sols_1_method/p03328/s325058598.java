import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = b - a - 1;
    int ax = 0;
    for (int i = 1; i <= n; i++) {
      ax += i;
    }
    System.out.println(ax - a);
  }
}