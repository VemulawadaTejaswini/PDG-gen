import java.util.*;
class Main{
  static int mod = 998244353;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    long[] a = new long[n];
    for (int i=0;i<n;i++){
      d[i] = sc.nextInt();
      a[d[i]]++;
    }
    sc.close();
    if (d[0] != 0 || a[0] != 1){
      System.out.println(0);
      return;
    }
    long ans = 1;
    for (int i=1;i<n;i++){
      ans *= a[d[i]-1];
      ans %= mod;
    }
    System.out.println(ans);
  }
}