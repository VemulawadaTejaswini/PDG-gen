import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] f = new int[m]; // foods
		
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				f[sc.nextInt() - 1]++;
			}
		}
		
		int ans = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i] == n) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
