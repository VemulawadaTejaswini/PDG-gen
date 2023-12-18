import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int[] ai = new int[n];
		int[] ans = new int[n];
		for(int i = 1; i < n; i++) {
			ai[i] = sca.nextInt();
			ans[ai[i]-1]++;
		}

		for(int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}

		// 後始末
		sca.close();
	}
}