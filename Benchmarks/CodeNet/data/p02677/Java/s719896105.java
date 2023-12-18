import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		double hour = in.nextDouble();
		double minute = in.nextDouble();

		double l = minute * 360 / 60;
		double s = (hour *60 + minute) * 360 /(12 * 60);

		double dif = 0;
		double result = 0;

		if(l > s) {
			/*if(l - s <= 90) {
				dif = l - s;
			}else if(l - s <= 180){
				dif = 90 - (l - s);
			}else if(l - s < 270){
				dif = 180 - (l - s);
			}else {
				dif = 360 - (l - s);
			}
			*/
			dif = l - s;
		}else {
			/*
			if(s - l <= 90) {
				dif = s - l;
			}else if(s - l <= 180){
				dif = 90 - (s - l);
			}else if(s - l < 270){
				dif = 180 - (s - l);
			}else {
				dif = 360 - (s - l);
			}
			*/
			dif = s - l;
		}
		if(dif <= 270) {
			dif = dif - 270;
		}else if(dif <= 180){
			dif = dif - 180;
		}else if(dif < 90){
			dif = dif - 90;
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
