import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		scan.close();
		double ans = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		ans = Math.sqrt(ans);
		System.out.println(ans);
	}
}
