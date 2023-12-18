import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int before = A[0];
		int min_before = A[0];
		int after = 0;
		int[] dp = new int[N];
		Arrays.fill(dp, 1000);
		List<Integer> befores = new ArrayList<>();

		for(int i=1; i<N; i++) {
			if(A[i] <= before) {
				before = Math.min(before, A[i]);
				min_before = Math.min(min_before, before);
			}else {
				if(befores.isEmpty()) {
					befores.add(before);
				}
				after = Math.max(after, A[i]);
				if(i<N-1 && after <= A[i+1]) {
					continue;
				}
//				System.out.println(before + "," + after);
				dp[i] = Math.max(dp[i]+(after-before)*(dp[i]/before), 1000+(after-min_before)*(1000/min_before));
				for(int j=i+1; j<N; j++) {
					dp[j] = dp[i];
//					System.out.println(j + ":" + dp[j]);
				}
				//初期化
				before = 500;
				after = 0;
			}
		}

		System.out.println(dp[N-1]);

	}


}
