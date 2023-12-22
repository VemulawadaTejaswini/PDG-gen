import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int maxCount = 0;
    int ans = 1;
    for (int i = 1; i <= N; i++) {
      int count = 0;
      int n = i;
      while (n % 2 == 0) {
        n /= 2;
        count++;
      }
      if (maxCount < count) {
        maxCount = count;
        ans = i;
      }
    }
    System.out.println(ans);
  }
}