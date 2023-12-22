
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		int ans = 0;
		for(int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			if(V[i] > C[i]) {
				ans += V[i] - C[i];
			}
		}
		System.out.println(ans);
	}

}
