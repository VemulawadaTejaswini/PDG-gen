import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 500円玉枚数
		int b = sc.nextInt(); // 100円玉枚数
		int c = sc.nextInt(); // 50円玉枚数
		int x = sc.nextInt(); // 合計金額

		int result = 0;

		for (int cntA = 0; cntA <= a; cntA++) {
			for (int cntB = 0; cntB <= b; cntB++) {
				for (int cntC = 0; cntC <= c; cntC++) {
					if ((500*cntA) + (100*cntB) + (50*cntC) == x) {
						result++;
					};
				}
			}
		}

		System.out.println(result);
	}
}

