import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//		int num = sc.nextInt();
		//		int n[][] = new int[][];

		//未受験を最初にFにする
		//A～Fをif elseで記述
		//ただしDはさらにネストで再試験50点の条件を用意する

		//前提Fの条件　mかfが-1
		//Aの条件　m+fが80以上
		//Bの条件　m+fが65以上
		//Cの条件　m+fが50以上　もしくは30<=m+f<50かつ50<=r
		//Dの条件　m+fが30以上
		//Fの条件　m+fが30未満
		//mfr全てが-1の時にループを抜ける

		//rの-1は影響を及ぼさない(無視)

		while (true) {

			int m = sc.nextInt();//中間試験
			int f = sc.nextInt();//期末試験
			int r = sc.nextInt();//再試験
			int p = m + f;

			if (m == -1 && f == -1 && r == -1) {
				break;
			} else if (m == -1 || f == -1) {//未受験
				System.out.println("F");
			} else if (p >= 80) {//A
				System.out.println("A");
			} else if (p >= 65) {//B
				System.out.println("B");
			} else if (p >= 50||(p < 50 && p >= 30 && r >= 50)) {//C
				System.out.println("C");
			} else if (p >= 30) {//D
				System.out.println("D");
			} else if (0 <= p && p < 30) {
				System.out.println("F");

			}

		}

	}

}
