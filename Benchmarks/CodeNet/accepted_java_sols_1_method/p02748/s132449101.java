import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[A];
    int[] b = new int[B];
    int ma = 1000000;
    int mb = 1000000;
    for(int i = 0; i < A; i++) {
      a[i] = sc.nextInt();
      ma = Math.min(ma, a[i]);
    }
    for(int i = 0; i < B; i++) {
      b[i] = sc.nextInt();
      mb = Math.min(mb, b[i]);
    }
    int ans = ma + mb;
    for(int i = 0; i < m; i++) {
      int x = sc.nextInt() - 1;
      int y = sc.nextInt() - 1;
      int c = sc.nextInt();
      ans = Math.min(ans, a[x] + b[y] - c);
    }
    System.out.println(ans);
  }
}