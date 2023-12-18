import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    long[] A = new long[N];
    for(int i=0; i<N; i++) {
      A[i] = sc.nextLong();
    }
    long mod = (long)Math.pow(10,9)+7;
    
    long sum = 0; //累積和
    long ans = 0; //答え
    for(int i=0; i<N; i++) {
      ans = (ans+A[i]*sum)%mod;
      sum = (A[i]+sum)%mod;
    }
    
    System.out.println(ans);  
  }
}