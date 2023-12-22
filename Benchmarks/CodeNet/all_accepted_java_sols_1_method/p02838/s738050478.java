import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
    }
    long ans=0;
    long zer;
    long one;
    long mod=1000000007;
    for(long i=1;i<1152921504606846976l;i*=2){
      zer=0;
      one=0;
      for(int j=0;j<n;j++){
        if((a[j]/i)%2==1){
          one++;
        }else{
          zer++;
        }
      }
      ans=((((((zer%mod)*(one%mod))%mod)*(i%mod))%mod)+ans)%mod;
    }
    System.out.println(ans);
  }
}