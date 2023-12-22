import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a = scan.nextInt();//短針の長さ
		double b = scan.nextInt();//長針の長さ
		int h = scan.nextInt();//時間
		int m = scan.nextInt();//分
		double a_w = (30 * h) + (0.5 * m);//短針の角度
		double b_w = 6 * m;//長針の角度
		double w = 0;
		double ans = 0;

		if(a_w >= b_w) {
			w = a_w - b_w;
		}else {
			w = b_w - a_w;
		}

		if(w > 180) {
			w = 360 - w;
		}

		ans = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2) - (2 * a * b * Math.cos(Math.toRadians(w))));

		System.out.printf("%.20f" , ans);
	}
}
