import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    int[] L = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      L[i] = sc.nextInt();
    }
    sc.close();

    Integer[] idx = new Integer[N];
    for (int i = 0; i < N; i++) idx[i] = i;
    Arrays.sort(idx, (l, r) -> Integer.compare(X[l] + L[l], X[r] + L[r]));

    int ans = 0;
    int c = Integer.MIN_VALUE;
    for (Integer i : idx) {
      int x = X[i];
      int l = L[i];
      if (c <= x - l) {
        ans++;
        c = x + l;
      }
    }
    System.out.println(ans);    
  }
}