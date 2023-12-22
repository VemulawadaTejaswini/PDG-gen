import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);

	int n = sca.nextInt();
	int k = sca.nextInt();
	long[] hi = new long[n];
	for(int i = 0; i < n; i++) {
		hi[i] = sca.nextLong();
	}

	Arrays.sort(hi);

	long ans = 0L;

	if(n <= k) {
		ans = 0;
	}
	else {
		for(int i = 0; i <= n-1-k; i++) {
			ans = ans + hi[i];
		}
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}