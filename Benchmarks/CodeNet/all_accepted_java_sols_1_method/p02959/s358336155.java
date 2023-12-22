import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n+1];
    //int sum = 0;
    for (int i = 0;i<n+1;i++){
      a[i] = sc.nextLong();
      //sum += a[i];
    }
    long b;
    long ans=0;
    long kill;
    for (int i = 0;i<n;i++){
      b = sc.nextLong();
      kill = Math.min(a[i],b);
      a[i] -= kill;
      ans += kill;
      if (b != kill){
        b -= kill;
        kill = Math.min(a[i+1],b);
        a[i+1] -= kill;
        ans += kill;
      }
    }
    System.out.println(ans);
  }
}