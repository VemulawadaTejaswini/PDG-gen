import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		if (s < 3){
			System.out.println(0);
			return;
		}

		long[] ans = new long[s+1];

		for (int i = 3; i<=s; i++){

			ans[i]++;

			for (int j= 3; j<= i-3; j++){
				ans[i] += ans[j];
				ans[i] %= 1000000007;
			}
		}
		System.out.println(ans[s]);
	}
}