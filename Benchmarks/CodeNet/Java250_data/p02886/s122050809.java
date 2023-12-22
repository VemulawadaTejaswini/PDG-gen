import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] d = new int[N];
      long sum = 0;
      d[0] = sc.nextInt();
      for(int i=1;i<N;i++){
        d[i]=sc.nextInt();
        for(int j=0;j<i;j++){
          sum = sum + d[j]*d[i];
        }
      }

      System.out.println(sum);

    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}