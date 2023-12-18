import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] s = new int[N];
    for (int i = 0; i < N; i++) {
      s[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += s[i];
    }
    Arrays.sort(s);
    if (sum % 10 == 0) {
      for (int i = 0; i < N; i++) {
        if ((sum - s[i]) % 10 != 0) {
          System.out.println(sum - s[i]);
          return;
        }
      }
      System.out.println(0);
    } else {
      System.out.println(sum);
    }
  }
}