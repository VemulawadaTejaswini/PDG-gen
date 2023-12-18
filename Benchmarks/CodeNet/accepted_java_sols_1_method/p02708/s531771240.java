import java.util.*;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long k = sc.nextInt();
    
    long ans = 0;
    long mod = 1000000007;
    long min = (1+k)*k/2;
    long max = (n+1)*n/2;
    long p;
    
    for(long i=k;i<=n+1;i++){  
      ans += (((n-i+1)+n)*i/2 - (i-1)*i/2 + 1) % mod;
      ans %= mod;
    }
    System.out.println(ans);
    
    
  }
}