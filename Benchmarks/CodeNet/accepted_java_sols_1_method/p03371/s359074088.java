import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if (a+b<=2*c) {
			System.out.println((a*x)+(b*y));
		}else if (a>2*c) {
			if (b>2*c) {
				System.out.println(2*c*Math.max(x, y));
			}else {
				System.out.println((2*c*x)+(b*Math.max(0, y-x)));
			}
		}else if (b>2*c) {
			System.out.println((2*c*y)+(a*Math.max(0, x-y)));
		}else {
			if (x<=y) {
				System.out.println((2*c*x)+(b*(y-x)));
			}else {
				System.out.println((2*c*y)+(a*(x-y)));
			}
		}
	}

}