import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long ans = 0;
		int[] D = new int[N];
		for(int i = 0;i < N;i++) {
			D[i] = scn.nextInt();
		}

		for(int i = 0;i < N;i++) {
			for(int j = i+1;j < N;j++) {
				ans += D[i] * D[j];
			}
		}
		System.out.println(ans);
	}

}