import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int[] x = new int[5];
		boolean error = false;
		for (int i = 0; i < 5; i++) {
			x[i] = sc.nextInt();
			if (x[i] > 123 || x[i] < 1) {
				error = true;
			}
		}
		// 入力チェック
		if (error) {
			System.out.println("無効な入力値です");
			return;
		}
		
		// 答えを出力
		int count = 0;
		int max = 0;
		for (int i = 0; i < 5; i++) {
			count = count + x[i];
			if (10 - x[i] % 10 != 10){
				count = count + 10 - x[i] % 10;
				if (max <= 10 - x[i] % 10) {
					max = 10 - x[i] % 10;
				}
			}
		}
		count = count - max;
		System.out.println(count);
	}
}
