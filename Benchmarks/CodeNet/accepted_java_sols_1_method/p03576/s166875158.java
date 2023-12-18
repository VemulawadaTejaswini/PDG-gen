import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		long ans = Long.MAX_VALUE/2;
		for(int i : x) {
			for(int j : x) {
				for(int k : y) {
					for(int l : y) {
						int c = 0;
						for(int m = 0; m < N; m++)
							if(i <= x[m] && x[m] <= j && k <= y[m] && y[m] <= l)
								c++;
						if(c >= K)
							ans = Math.min(ans, Math.abs((long)(j-i)*(l-k)));
					}
				}
			}
		}
		System.out.println(ans);
	}

}