import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int []money = new int[50];
		int []set = {1520, 1870, 2244};
		Arrays.fill(money, 10000000);
		for(int i = 0; i <= 22; i++) {
			for(int j = 0; j <= 16; j++) {
				for(int k = 0; k <= 10; k++) {
					int w = 200 * i + 300 * j + 500 * k;
					if(w < 500) continue;
					if(w > 5000) break;
					int t1 = i / 5;
					int t2 = j / 4;
					int t3 = k / 3;
					int m = t1 * set[0] + t2 * set[1] + t3 * set[2];
					m += (i - t1 * 5) * 380;
					m += (j - t2 * 4) * 550;
					m += (k - t3 * 3) * 850;
					money[w / 100 - 1] = Math.min(money[w / 100 - 1], m);
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			int k = sc.nextInt();
			if(k == 0) break;
			System.out.println(money[k / 100 - 1]);
		}
		sc.close();
	}
}
