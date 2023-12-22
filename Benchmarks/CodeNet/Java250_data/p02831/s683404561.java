import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    int max = Math.max(A, B);
    int min = Math.min(A, B);
    
    long ans = max;
    while (ans % min != 0) ans += max;
    System.out.println(ans);
  }
}