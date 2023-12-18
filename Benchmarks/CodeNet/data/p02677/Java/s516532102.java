import java.util.Scanner;

// https://atcoder.jp/contests/abc168/tasks/abc168_c
public class　Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();
		sc.close();


		double aw = h*30.0  +  m * 0.5;
		double bw = m * 6.0;

		double w = aw - bw;
		double cos = Math.cos(Math.toRadians(w));
		if(Math.abs(cos)>Math.pow(1.0, -17)) {
			cos = 0.0;
		}

		double ans = a*a + b*b - 2.0*a*b*cos;
		System.out.println(Math.sqrt(ans));

	}
}
