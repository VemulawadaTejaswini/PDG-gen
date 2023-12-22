import java.util.Scanner;

// 分かってないがサンプル通ったので提出
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int q = sc.nextInt();
    int[]a = new int[n+1];

    if(k-q > 0) {
      for(int i=0; i<n; ++i)
        System.out.println("Yes");
      System.exit(0);
    }

    for(int i=0; i<q; ++i)
      ++a[sc.nextInt()];

    for(int i=1; i<=n; ++i) {
      if(a[i] + k - q <= 0) System.out.println("No");
      else System.out.println("Yes");
    }

  }
}