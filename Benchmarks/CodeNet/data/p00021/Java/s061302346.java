import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n-- > 0) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double x4 = scan.nextDouble();
			double y4 = scan.nextDouble();
			
			double x12 = x2 - x1;
			double y12 = y2 - y1;
			double e12 = (x12 * x12) + (y12 * y12);
			double x34 = x4 - x3;
			double y34 = y4 - y3;
			double e34 = (x34 * x34) + (y34 * y34);
			
			if ((x12/e12 == x34/e34 && y12/e12 == y34/e34) || (x12/e12 == -x34/e34 && y12/e12 == -y34/e34)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	
	private void debug() {
		System.out.println();
	}

}