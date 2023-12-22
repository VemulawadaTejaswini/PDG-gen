import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < q; i++) {
      int t = sc.nextInt() - 1;
      a[t]++;
    }
    for(int i = 0; i < n; i++) {
      String ans = "Yes";
      if(a[i] <= q - k) ans = "No";
      System.out.println(ans);
    }
  }
}