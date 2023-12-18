import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long ans = 0;
    for(long b=1;b<=n;b++){
      long p = 0;
      long r = n;
      while(r>=b){
        p++;
        r-=b;
      }
      ans+=p*Math.max(b-k,0)+Math.max(0,r-k+1);
    }
    if(k==0)ans-=n;
    System.out.println(ans);
  }
}