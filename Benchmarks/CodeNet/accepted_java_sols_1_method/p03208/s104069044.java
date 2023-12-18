import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int[] H = new int[N];
		for(int i = 0;i < N;i++) {
			H[i] = scn.nextInt();
		}
		Arrays.sort(H);
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i < N-K+1;i++) {
			ans = Math.min(ans, H[K-1+i] - H[i]);
		}
		System.out.println(ans);

	}
}
