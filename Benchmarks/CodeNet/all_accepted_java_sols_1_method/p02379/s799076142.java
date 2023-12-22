import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double x1,y1,x2,y2;
		Scanner scan = new Scanner(System.in);
		x1=scan.nextDouble();
		y1=scan.nextDouble();
		x2=scan.nextDouble();
		y2=scan.nextDouble();
		System.out.println(String.format("%.8f", Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))));
	}
}
