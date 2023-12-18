import java.util.Scanner;

public class test00 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		scan.close();
		double dbX = Math.pow(x2 - x1, 2);
		double dbY = Math.pow(y2 - y1, 2);
		double dbAns = Math.sqrt(dbX + dbY);
		System.out.println(dbAns);
	}
}