import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] h = new long[n];
    for(int i = 0;i < n;i++)h[i]=sc.nextLong();
    long[] sum = new long[n];
    Arrays.fill(sum,(long)Math.pow(10,15));
    sum[0]=0;
    if(k>=n){
      long min = (long)Math.pow(10,15);
      for(int i = 1;i < n;i++)min = Math.min(min,Math.abs(h[0]-h[i]));
      System.out.println(min);
      return;
    }
    for(int i = 1;i < k;i++){
      for(int j = 1;j <= i;j++){
        sum[i]=Math.min(sum[i],sum[i-j]+Math.abs(h[i]-h[i-j]));
      }
    }
    for(int i = k;i < n;i++){
      for(int j = 1;j <= k;j++){
        sum[i]=Math.min(sum[i],sum[i-j]+Math.abs(h[i]-h[i-j]));
      }
    }
    System.out.println(sum[n-1]);
  }
}