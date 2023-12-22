import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		//固定端を原点として，デカルト座標系における各針の先端の座標を計算．
		double Ax = A * Math.sin(Math.PI * ((60 * H) + M) / 360);
		double Ay = A * Math.cos(Math.PI * ((60 * H) + M) / 360);

		double Bx = B * Math.sin(Math.PI * M / 30);
		double By = B * Math.cos(Math.PI * M / 30);

		double d_square = (Ax - Bx) * (Ax - Bx) + (Ay - By) * (Ay - By);
		double d = Math.sqrt(d_square);

		System.out.println(d);
	}
}
