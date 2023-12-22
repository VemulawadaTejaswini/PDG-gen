import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int d = Math.max(a, b);
    d = Math.max(d, c);
    int e = d;
    for (int i = 0; i < k; i++) {
      d *= 2;
    }
    System.out.println(a + b + c + d - e);
  }
}