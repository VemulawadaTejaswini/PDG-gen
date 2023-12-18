import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double a = (x2 - x1) * (x2 - x1);
		double b = (y2 - y1) * (y2 - y1);
		double c = a + b;
		double d = Math.sqrt(c);
		System.out.println(d);
	}
}



		

	