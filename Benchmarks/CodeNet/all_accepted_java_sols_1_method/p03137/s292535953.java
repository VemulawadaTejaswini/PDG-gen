import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[] X = new int[M];
		Integer[] diff_X = new Integer[M - 1];
		for(int i = 0; i < M; i++) X[i] = sc.nextInt();
		Arrays.sort(X);
		for(int i = 1; i < M; i++) {
			diff_X[i - 1] = X[i] - X[i - 1];
		}
		Arrays.sort(diff_X);
		int ans = 0;
		for(int i = 0; i < Math.max(M - N, 0); i++) {
			ans += diff_X[i];
		}
		System.out.println(ans);
	}
}
