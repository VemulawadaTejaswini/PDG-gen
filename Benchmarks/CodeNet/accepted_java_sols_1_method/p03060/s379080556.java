import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] v = new int[n];
    int[] c = new int[n];
    for(int i=0; i<n; ++i)
      v[i] = sc.nextInt();
    for(int i=0; i<n; ++i)
      c[i] = sc.nextInt();

    // X-Yを先に計算してソートする
    for(int i=0; i<n; ++i)
      v[i] -= c[i];
    Arrays.sort(v);

    // 最大値を求める
    int ans = 0;
    for(int i=n-1; i>=0; --i){
      if(v[i] > 0 )
        ans += v[i];
    }
    System.out.println(ans);
  }
}