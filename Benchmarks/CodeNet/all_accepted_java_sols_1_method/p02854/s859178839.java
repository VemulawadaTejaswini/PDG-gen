import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    long[] sum = new long[n];
    sum[0]=a[0];
    for(int i=1;i<n;i++)sum[i]=sum[i-1]+a[i];
    long min = (long)Math.pow(10,12);
    for(int i=0;i<n;i++)min = Math.min(min,Math.abs(sum[n-1]-2*sum[i]));
    System.out.println(min);
  }
}