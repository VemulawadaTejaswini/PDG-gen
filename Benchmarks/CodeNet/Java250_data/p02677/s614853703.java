import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double result = 0;
		int minute = M + 60 * H;
		double radianA = 0.5 * minute;
		double radianB = 6 * minute;
		while (radianB >= 360) {
			radianB = radianB - 360;
		}
		//System.out.println(result);
		//System.out.println(radianA);
		//System.out.println(radianB);
		result = Math.sqrt(
				Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(Math.toRadians(Math.abs(radianA - radianB))));
		System.out.println(result);

	}

}
