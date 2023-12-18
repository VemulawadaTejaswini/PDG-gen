import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int hour = in.nextInt();
		int minute = in.nextInt();

		double l = minute * 360 / 60;
		double s = (hour *60 + minute) * 360 /(12 * 60);

		double dif = 0;
		double result = 0;

		if(l > s) {
			if(l - s <= 90) {
				dif = l - s;
			}
		}else {
			dif = 360 - (l - s);
		}

		result = a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(dif));
		result = Math.sqrt(result);

		/*
		System.out.println(l);
		System.out.println(s);
		System.out.println(dif);
		*/
		System.out.println(String.format("%.20f", result));
	}

}
