import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	void doIt() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;
		if(K >= A) {
			K -= A;
			sum += A;
		}
		else {
			sum += K;
			K = 0;
		}
		K -= B;
		if(K >= 0) {
			sum -= Math.min(K, C);
		}
		System.out.println(sum);
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
