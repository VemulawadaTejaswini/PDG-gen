import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] L = new int[N];
		int[][] a = new int[N][2];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			L[i] = sc.nextInt();
			a[i][0] = X[i]- L[i];
			a[i][1] = X[i] + L[i];
		}
		Arrays.sort(a, (x,y) -> x[1]-y[1]);
		int ans = 1;
		int p = a[0][1];
		for(int i = 1;i < N;i++){
			if(a[i][0] >= p){
				ans++;
				p = a[i][1];
			}
		}
		System.out.println(ans);
	}
}