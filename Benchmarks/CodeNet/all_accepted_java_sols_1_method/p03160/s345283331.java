import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] h = new long[n];
    for(int i = 0;i < n;i++)h[i]=sc.nextLong();
    long[] sum = new long[n];
    sum[0]=0;
    sum[1]=Math.abs(h[0]-h[1]);
    for(int i = 2;i <= n-1;i++)
      sum[i]=Math.min(sum[i-1]+Math.abs(h[i]-h[i-1]),sum[i-2]+Math.abs(h[i]-h[i-2]));
    System.out.println(sum[n-1]);
  }
}