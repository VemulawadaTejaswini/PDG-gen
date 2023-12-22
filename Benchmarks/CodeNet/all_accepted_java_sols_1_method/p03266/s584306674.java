import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    // a+b = l*K, b = l*K - a
    // b+c = m*K, l*K + n*K - 2*a = m*K
    // c+a = n*K, c = n*K - a
    //
    // (l+n-m)*K = 2*a
    // x*K = 2*a
    // y*K = 2*b
    // z*K = 2*c
    

    int sum1 = N/K;

    int sum2 = 0;
    if (K%2 == 0) {
      sum2 = (N+K/2)/K;
    }
    
    System.out.println((long)sum1*sum1*sum1 + (long)sum2*sum2*sum2);
  }
}