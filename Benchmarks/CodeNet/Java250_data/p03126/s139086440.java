import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m =sc.nextInt();
		int k, a;
		int food[][] = new int[n][m + 1];
		for(int i = 0; i < n; ++i) {
			k = sc.nextInt();
			for(int j = 0; j < k; ++j) {
				a = sc.nextInt();
				food[i][a]++;
			}
		}
		sc.close();
		int ans = 0;
		int j = 0;
		for(int i = 1; i <= m; ++i) {
			for(j = 0; j < n; ++j) {
				if(food[j][i] == 0)break;
			}
			if(j == n)++ans;
		}
		System.out.println(ans);
	}

}
