import java.util.Scanner;


class Main {

	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);

		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		double P1 =Math.abs(Math.pow(x2-x1, 2));//各座標の距離の２乗の絶対値を求める
		double P2 =Math.abs(Math.pow(y2-y1, 2));
	 System.out.println(Math.sqrt(P1+P2));//合計の平方根を求める

		scanner.close();
	}
}

