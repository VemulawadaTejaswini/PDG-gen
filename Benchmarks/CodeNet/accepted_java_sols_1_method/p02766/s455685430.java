import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    sc.close();

    int ans = 0;
    int n = N;
    while (n != 0) {
      n /= K;
      ans++;
    }
    System.out.println(ans);
  }
}
