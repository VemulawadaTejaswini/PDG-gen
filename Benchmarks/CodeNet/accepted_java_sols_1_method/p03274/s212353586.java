import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] x = new int[N+1];
    long min =300000000; 
    for (int i =1; i<=N; i++) {
      x[i] = sc.nextInt();
    }
    for (int i =1; i<=N-K+1; i++) {
      long ans =0;
      if (x[i] <=0 && x[i+K-1] >= 0) {
        ans = Math.min(Math.abs(x[i]) + (x[i+K-1] - x[i]),
                       Math.abs(x[i+K-1]) + (x[i+K-1] - x[i]));
      }
      if (x[i] <=0 && x[i+K-1] <=0) ans = Math.abs(x[i]);
      if (x[i] >=0 && x[i+K-1] >=0) ans = Math.abs(x[i+K-1]);
      min = Math.min(ans,min);
    }
    System.out.print(min);
  }
}