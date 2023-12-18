import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = (int)1e9 + 7;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e7;
	
	
	void doIt() {
		int N = sc.nextInt();
		long[] num = new long[N + 1];
		Arrays.fill(num, 2);
		num[1] = 1;
		for(int i = 2; i <= N; i++) {
			for(int j = i * 2; j <= N; j += i) {
				num[j]++;
			}
		}
		long sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += i * num[i];
		}
		System.out.println(sum);
		//System.out.println(Arrays.toString(num));
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
 
}