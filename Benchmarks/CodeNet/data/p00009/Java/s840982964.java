

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int i, j, cnt = 0, flg;
			for (i = 1; i <= n; i = i + 2) {
				flg = 0;
				for (j = 3; j <= i/j; j = j + 2) {
					if (i % j == 0) {
						flg++;
						break;
					}
				}
				if(flg == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		scanner.close();
	}

}

