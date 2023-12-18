

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = new int[1000003];
		int i, j, cnt = 0, flg;
		for (i = 2; i <= 1000000; i++) {
			flg = 0;
			for (j = 2; j <= i/j; j++) {
				if (i % j == 0) {
					flg++;
					break;
				}
			}
			if(flg == 0) {
				cnt++;
			}
			num[i] = cnt;
		}
		Scanner scanner = new Scanner(System.in);
		int n=0;
		while(scanner.hasNext()) {
			n = scanner.nextInt();
			System.out.println(num[n]);
			}
		scanner.close();
	}

}

