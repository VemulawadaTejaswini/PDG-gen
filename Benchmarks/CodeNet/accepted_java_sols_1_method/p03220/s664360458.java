import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int H[] = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int ans = 0;
		double min = Double.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			if(Math.abs(((double)T - (double)H[i] * 0.006) - (double)A) < min) {
				min = Math.abs(((double)T - (double)H[i] * 0.006) - (double)A);
				ans = i + 1;
			}
		}
		System.out.println(ans);
	}
}
