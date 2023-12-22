
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] V = new int[n];
		int[] C = new int[n];
		for(int i = 0; i < n; i++) {
			V[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			C[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(V[i] > C[i]) {
				ans += V[i] - C[i];
			}
		}
		System.out.println(ans);

		sc.close();
	}

}

