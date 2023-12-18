import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ans = new int[n+1];
    for (long i = 1; i < 101; i++) {
      for (long j = 1; j < 101; j++) {
        for (long k = 1; k < 101; k++) {
          long ret = i * i + j * j + k * k + i * j + j * k + k * i;
          if (ret > n) continue;
          ans[(int)ret]++;
        }
      }
    }
    for (int i = 1; i < n+1; i++) {
      System.out.println(ans[i]);
    }
  }
}
