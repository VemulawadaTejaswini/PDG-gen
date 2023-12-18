import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    long wa=0;
    long ans=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
      ans=ans+a[i]*wa;
      wa+=a[i];
      ans%=1000000007L;
    }
    System.out.println(ans);
  }
}