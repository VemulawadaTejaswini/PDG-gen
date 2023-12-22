import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();//好きな数字
		//
		int num = 7;
		int ans = -1;
		for (int i = 1; i <= K; i++) {
			if (num % K == 0) {
				ans = i;
				break;
			}
			num = (num * 10 + 7) % K;
		}
		System.out.println(ans);

	}

}
