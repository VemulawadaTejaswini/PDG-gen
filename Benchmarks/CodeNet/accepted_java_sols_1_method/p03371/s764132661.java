import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int price;

		if (A+B < 2*C){
			price = A*X + B*Y;
		} else {
			int ACnt=0;
			int BCnt=0;
			int CCnt=0;
			CCnt = 2 * Math.min(X, Y);
			int remainA = X - CCnt/2;
			int remainB = Y - CCnt/2;
			if (remainA > 0){
				if (A >= 2*C){
					CCnt += remainA * 2;
				} else {
					ACnt += remainA;
				}
			} else {
				if (B >= 2*C){
					CCnt += remainB * 2;
				} else {
					BCnt += remainB;
				}
			}
			price = A * ACnt + B * BCnt + C*CCnt;
		}
		System.out.println(price);
	}

}
