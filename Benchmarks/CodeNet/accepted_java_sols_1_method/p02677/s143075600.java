
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		double xLong = 0;
		double yLong = 0;
		double xShort = 0;
		double yShort = 0;
		double ans = 0;

		double ThetaLong = 0;
		double ThetaShort = 0;

		double minute = H * 60 + M;

		if(H < 3) {
			ThetaShort = 90 - 0.5 * minute;
			xShort = A * Math.cos(Math.toRadians(ThetaShort));
			yShort = A * Math.sin(Math.toRadians(ThetaShort));
		}else if(H < 6) {
			ThetaShort = 0.5 * minute - 90;
			xShort = A * Math.cos(Math.toRadians(ThetaShort));
			yShort = -A * Math.sin(Math.toRadians(ThetaShort));
		}else if(H < 9) {
			ThetaShort = 270 - 0.5 * minute;
			xShort = -A * Math.cos(Math.toRadians(ThetaShort));
			yShort = -A * Math.sin(Math.toRadians(ThetaShort));
		}else {
			ThetaShort = 0.5 * minute - 270;
			xShort = -A * Math.cos(Math.toRadians(ThetaShort));
			yShort = A * Math.sin(Math.toRadians(ThetaShort));
		}

		if(M < 15) {
			ThetaLong = 90 - 6 * M;
			xLong = B * Math.cos(Math.toRadians(ThetaLong));
			yLong = B * Math.sin(Math.toRadians(ThetaLong));
		}else if(M < 30) {
			ThetaLong = 6 * M - 90;
			xLong = B * Math.cos(Math.toRadians(ThetaLong));
			yLong = -B * Math.sin(Math.toRadians(ThetaLong));
		}else if(M < 45) {
			ThetaLong = 270 - 6 * M;
			xLong = -B * Math.cos(Math.toRadians(ThetaLong));
			yLong = -B * Math.sin(Math.toRadians(ThetaLong));
		}else {
			ThetaLong = 6 * M - 270;
			xLong = -B * Math.cos(Math.toRadians(ThetaLong));
			yLong = B * Math.sin(Math.toRadians(ThetaLong));
		}

		ans = Math.sqrt( Math.pow(xShort-xLong, 2) + Math.pow(yShort-yLong, 2));
		System.out.println(ans);

		scan.close();
	}
}
