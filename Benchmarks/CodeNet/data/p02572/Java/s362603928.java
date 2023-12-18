import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int mod = 1000000007;
    int n = sc.nextInt();
    
    //A1～An の和、sum。A1^2～An^2 の和、squ
    long sum = 0, squ = 0, ans, a;
    for(int i = 0; i < n; i++){
      a = sc.nextInt();
      sum += a;
      squ += a * a;
    }
    
    //sum^2からsquを引いて2で割る
    ans = (sum * sum - squ) / 2;
    ans = ans % mod;
    System.out.println(ans);
  }
}
