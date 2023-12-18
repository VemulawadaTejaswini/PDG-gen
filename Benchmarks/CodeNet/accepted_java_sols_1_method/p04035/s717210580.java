import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long l = sc.nextLong();
    long[] a = new long[n];
    long max = 0;
    int p = 0;
    for(int i = 0;i < n;i++)a[i]=sc.nextLong();
    for(int i = 0;i < n-1;i++){
      max = Math.max(max,a[i]+a[i+1]);
      if(a[i]+a[i+1]==max)p=i;
    }
    if(a[p]+a[p+1]<l)System.out.println("Impossible");
    else{
      System.out.println("Possible");
      for(int i = 1;i <= p;i++)System.out.println(i);
      for(int i = n-1;i>=p+1;i--)System.out.println(i);
    }
  }
}
