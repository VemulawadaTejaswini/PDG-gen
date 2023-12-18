import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();

			if(n == 0 && m == 0 && p ==0) {
				break;
			}
			int [] x = new int[n];
			int ticketSum = 0;
			for(int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				ticketSum += x[i];
			}

			int backGold = ticketSum * (100-p);
			int ans = 0;

			if(x[m-1] != 0) {
			ans = backGold/x[m-1];
			}

			System.out.println(ans);
		}
	}
}
