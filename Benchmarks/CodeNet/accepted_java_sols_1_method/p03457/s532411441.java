import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		final String YES	= "Yes";
		final String NO		= "No";

		String res = YES;

		// TODO ABC_086_C
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

		int tNow = 0;
		int xNow = 0;
		int yNow = 0;
		int tNext = 0;
		int xNext = 0;
		int yNext = 0;

		int xDist = 0;
		int yDist = 0;

		for(int i=0; i<N; i++) {

			tNext = sc.nextInt();
			xNext = sc.nextInt();
			yNext = sc.nextInt();

			if(tNext%2 != (xNext+yNext)%2) {
				res = NO;
				break;
			}

			xDist = Math.abs(xNext - xNow);
			yDist = Math.abs(yNext - yNow);

			if(tNext - tNow < xDist + yDist) {
				res = NO;
				break;
			} else {
				tNow = tNext;
				xNow = xNext;
				yNow = yNext;
			}
		}

		// Scannerクラスのインスタンスをクローズ
		sc.close();

		System.out.println(res);
	}
}
