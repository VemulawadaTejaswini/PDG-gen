import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int m = sca.nextInt();
		int[] ai = new int[m];
		long date = 0L;

		for(int i = 0; i < m; i++) {
			ai[i] = sca.nextInt();
			date += ai[i];
		}
		if(date > n) {
			System.out.println(-1);
		}
		else {
			System.out.println(n-date);
		}


		// 後始末
		sca.close();
	}
}