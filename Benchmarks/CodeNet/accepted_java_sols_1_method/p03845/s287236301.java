import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), drinkIdx, drinkVal, ans = 0;
		int[] t = new int[n+1];
		for (int i = 1; i <= n; i++) t[i] = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1; i <= m; i++) {
			drinkIdx = sc.nextInt();
			drinkVal = sc.nextInt();
			ans = 0;
			for (int j = 1; j <= n; j++) {
				if (drinkIdx != j) ans += t[j];
				else ans += drinkVal;
			}
			System.out.println(ans);
		}
	}

}