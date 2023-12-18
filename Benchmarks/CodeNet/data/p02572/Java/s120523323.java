import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<Integer>();
		long sum = 0;
		int mod = 1000000007;
		int N = stdIn.nextInt();
		for(int i = 0; i < N; i ++) {
			A.add(stdIn.nextInt());
			sum += A.get(i);
			sum %= mod;
		}
		
		double ans = 0;
		
		for(int i = 0; i < A.size() - 1; i ++) {
			sum -= A.get(i);
			if(sum < 0) {
				sum += mod;
			}
			
			ans += A.get(i) * sum;
			ans %= mod;
		}
		
		System.out.println((int)ans);
		
	}
}