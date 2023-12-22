import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		sc.close();

		int cost = 0;
		if(A + B < 2 * C) {
			if(X > Y) {
				cost = (A + B) * Y + A * (X - Y);
			}else if(X < Y) {
				cost = (A + B) * X+ B * (Y - X);
			}else {
				cost = (A + B) * X;
			}
		}else if(A + B > 2 * C){
			if(X > Y) {
				if(A <= 2 * C) {
					cost = 2 * C * Y + A * (X - Y);
				}else {
					cost = 2 * C * Y + 2 * C * (X - Y);
				}
			}else if(X < Y) {
				if(B <= 2 * C) {
					cost = 2 * C * X + B * (Y - X);
				}else {
					cost = 2 * C * X + 2 * C * (Y - X);
				}
			}else {
				cost = 2 * C * X;
			}
		}else {
			if(X > Y) {
				if(A <= 2 * C) {
					cost = 2 * C * Y + A * (X - Y);
				}else {
					cost = 2 * C * Y + 2 * C * (X - Y);
				}
			}else if(X < Y) {
				if(B <= 2 * C) {
					cost = 2 * C * X + B * (Y - X);
				}else {
					cost = 2 * C * X + 2 * C * (Y - X);
				}
			}else {
				cost = 2 * C * X;
			}
		}
		System.out.println(cost);
	}

}