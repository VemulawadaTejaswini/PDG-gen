import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long X = sc.nextLong();
		long Y = sc.nextLong();
		
		long sum = 0;
		
		if(A + B >= 2 * C) {
			if(X >= Y) {
				sum = 2 * C * Y;
				if(A >= 2 * C) {
					sum += (X - Y) * 2 * C;
				} else {
					sum += (X - Y) * A;
				}
			} else {
				sum = 2 * C * X;
				if(B >= 2 * C) {
					sum += (Y - X) * 2 * C;
				} else {
					sum += (Y - X) * B;
				}
			}
		} else if(A + B < 2 * C) {
			sum = A * X + B * Y;
		}
		System.out.println(sum);
	}
}
