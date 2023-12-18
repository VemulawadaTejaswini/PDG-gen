import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X[] = new int[M];
		int a[][] = new int[M - 1][2];
		for(int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		
		for(int i = 0; i < M; i++) {
			if(i > 0) {
				a[i - 1][0] = i - 1;
				if(X[i] <= 0 && X[i - 1] <= 0) {
					a[i - 1][1] = Math.abs(X[i] - X[i - 1]);
				} else if(X[i] > 0 && X[i - 1] <= 0){
					a[i - 1][1] = Math.abs(X[i]) + Math.abs(X[i - 1]);
				} else {
					a[i - 1][1] = X[i] - X[i - 1];
				}
			}
		}
		Arrays.sort(a, Comparator.comparingInt(o -> o[1]));
		
		int ans = 0;
		for(int i = M - N - 1; i >= 0; i--) {
			ans += a[i][1];
		}
		System.out.println(ans);
		
	}
}
