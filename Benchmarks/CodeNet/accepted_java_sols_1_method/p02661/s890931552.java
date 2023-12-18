import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int A = a[n / 2];
    int B = b[n / 2];
    int ans = B - A + 1;
    if((n % 2) == 0) {
      int aa = (a[n / 2] + a[(n / 2) - 1]);
      int bb = (b[n / 2] + b[(n / 2) - 1]);
      ans = (bb - aa + 1);
    }
    System.out.println(ans);
  }
}