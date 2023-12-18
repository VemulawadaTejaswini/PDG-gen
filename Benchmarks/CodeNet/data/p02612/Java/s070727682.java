

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i = 0;
		int ans = 0;
		while(i * 1000 < N) {
			i++;
			ans = i * 1000 - N;
		}

		System.out.println(ans);
	}

}
