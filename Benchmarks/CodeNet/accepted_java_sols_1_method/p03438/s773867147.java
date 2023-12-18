import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    long cnt = 0;
    for(int i = 0;i < n;i++)a[i]=sc.nextLong();
    for(int i = 0;i < n;i++)b[i]=sc.nextLong();
    for(int i = 0;i < n;i++){
      if(b[i]-a[i]>=0)cnt+=(b[i]-a[i])/2;
      else cnt+=b[i]-a[i];
    }
    if(cnt>=0)System.out.println("Yes");
    else System.out.println("No");
  }
}