import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] list = new int[m + 1];

		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				list[sc.nextInt()]++;
			}
		}

		int ans = 0;
		for(int i = 0; i < m; i++) {
			if(list[i + 1] == n) ans++;
		}

		System.out.println(ans);
	}
}
