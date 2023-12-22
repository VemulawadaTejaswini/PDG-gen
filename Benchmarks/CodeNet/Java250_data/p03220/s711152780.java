import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int N = sc.nextInt();
      double T = sc.nextDouble();
      double A = sc.nextDouble();
      double[] H = new double[N];
      double min = (double)1000;
      int ans =0;
      for (int i=0; i<N; i++) {
        H[i] = Math.abs((double)T - sc.nextDouble() * 0.006 -A);
        min = Math.min(H[i],min);
      }
      for (int i=0; i<N; i++) {
        if(H[i] == min) {
          ans = i+1;
          break;
        }
      }
      System.out.println(ans);
    }
}