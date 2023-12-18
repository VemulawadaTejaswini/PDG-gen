import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int h = in.nextInt();
		int m = in.nextInt();

		int pass_time = h*60 + m;
		double digA = (0.5 * (double)pass_time) % 360;
		double digB = (6 * pass_time) % 360;

		double result = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(Math.abs(digA-digB))));
		System.out.println(result);
	}

}
