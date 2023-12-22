import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		double ab = 0;
		double other = 0;
		double longHand = 0;
		double shortHand = 0;
		double angle = 0;
		int min = H * 60 + M;
		
		ab = Math.pow(A, 2) + Math.pow(B, 2);
		
		longHand = 6 * M;
		shortHand = 0.5 * min;
		angle = shortHand - longHand;
		if (H > 6) {
			angle = 360 - angle;
		}
		
		other = (2 * A * B) * Math.cos(Math.toRadians(angle));
		if (angle == 90.0) {
			other = 0;
		}
		
		System.out.println(Math.sqrt(ab - other));
		/*
		System.out.println(ab);
		System.out.println(other);
		System.out.println(Math.cos(Math.toRadians(90.0)));
		System.out.println(angle);
		*/
	}
}