import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    long ans = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      sum += a;
      if((a == 0) || (i == (n - 1))) {
        ans += (sum / 2);
        sum = 0;
      }
    }
    System.out.println(ans);
  }
}