import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long m = sc.nextInt();
    long mod = 1000000007;
    sc.close();
    long ans = 1;
    if (Math.abs(n-m) < 2){
      for (long i =1;i<=n;i++){
        ans = (ans*i)%mod;
      }
      for (long i =1;i<=m;i++){
        ans = (ans*i)%mod;
      }
      if (n == m){
        ans = ans*2%mod;
      }
    }else{
      ans = 0;
    }
    System.out.println(ans);
  }
}