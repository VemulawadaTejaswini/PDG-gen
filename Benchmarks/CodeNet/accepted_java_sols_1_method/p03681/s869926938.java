import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    if(Math.abs(n - m) > 1){
      System.out.println(0);
    }else if(n == m){
      long tmp1 = 1, tmp2 = 1;
      for(int i = 2; i <= n; i++){
        tmp1 = (i * tmp1) % 1000000007;
      }
      for(int i = 2; i <= m; i++){
        tmp2 = (i * tmp2) % 1000000007;
      }
      long ans = (tmp1 * tmp2 * 2) % 1000000007;
      System.out.println(ans);
    }else{
      long tmp1 = 1, tmp2 = 1;
      for(int i = 2; i <= n; i++){
        tmp1 = (i * tmp1) % 1000000007;
      }
      for(int i = 2; i <= m; i++){
        tmp2 = (i * tmp2) % 1000000007;
      }
      long ans = (tmp1 * tmp2) % 1000000007;
      System.out.println(ans);
    }
    
  }
}
