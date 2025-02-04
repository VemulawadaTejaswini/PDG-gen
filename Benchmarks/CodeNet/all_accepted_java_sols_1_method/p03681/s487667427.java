import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    if(Math.abs(N-M)>=2){
      System.out.println(0);
    }else{
      long[] fac = new long[Math.max(N,M)+1];
      fac[0] = 1;
      for(int i=1;i<=Math.max(N,M);i++){
        fac[i] = (fac[i-1]*i)%1000000007;
      }
      long ans = (fac[N]*fac[M])%1000000007;
      if(N==M){
        ans = (2L*ans)%1000000007;
      }
      System.out.println(ans);
    }
  }
}