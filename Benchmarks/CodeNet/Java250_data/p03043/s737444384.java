
import java.util.*;
import java.math.*;
public class Main {
  
  	public static double halfpow (int a){
			double d = 0.5;
			return Math.pow(d,a);
		}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double ans = 0;


        for (int i = 1; i < N+1; i++) {
			int cnt = 0;
            int j = i; 
			while (j < K)
			{
				j*=2;
				cnt++;
			}
  
			ans += halfpow(cnt);
		}
		ans = ans / N;
		
		System.out.println(ans);
	
	}
}
			