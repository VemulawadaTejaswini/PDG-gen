import java.util.*;
public class Main{
  public static long f(long x,long m){
    return x%m;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long x=sc.nextLong(),m=sc.nextLong();
    long[] a=new long[n],ans=new long[n];
    for(int i=0;i<n;i++){
      if(i==0){
        a[i]=x;
        ans[i]=a[i];
      }else{
        a[i]=f(a[i-1]*a[i-1],m);
        ans[i]=ans[i-1]+a[i];
        if(a[i]==0){
          break;
        }
      }
    }
    System.out.println(ans[n-1]);
  }
}
