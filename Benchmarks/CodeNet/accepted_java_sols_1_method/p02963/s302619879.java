import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long S = Long.parseLong(sc.next());

		int x1 = 0; // x1=0 確定
		int y1 = 0;
		int x2 = 0;
		int y2 = 0; // y2=0 確定
		int x3 = 0;
		int y3 = 0;

		// 平方根求める, ceil(平方根)をy3(高さ)にする
		Double y3d = Math.sqrt((double) S);
		y3 = new Double(Math.ceil(y3d)).intValue();

		// x3はceil(S/y3), x2はx3-1
		// y1 はS%y3、但し余り0のときはy3とする
		x3 = (int) (S / y3);
		y1 = (int) (S % y3);
		if (y1 != 0) {
			x3 += 1;
		} else {
			y1 = y3;
		}
		x2 = x3 - 1;

		// output
		System.out.println(x1 + " " + y1 + " "
				+ x2 + " " + y2 + " "
				+ x3 + " " + y3);

	}

}
