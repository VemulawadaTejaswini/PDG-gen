import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		
		double a = sc.nextDouble();
		double v = sc.nextDouble();
		double b = sc.nextDouble();
		double w = sc.nextDouble();
		double t = sc.nextDouble();
		
		if (a > b) {
			if (b-w*t >= a-v*t) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			if (b+w*t <= a+v*t) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

        sc.close();
	}
}