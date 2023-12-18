import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextInt();
		double y1 = scan.nextInt();
		double x2 = scan.nextInt();
		double y2 = scan.nextInt();
		double x = (x2 - x1) * (x2 - x1);
		double y = (y2 - y1) * (y2 - y1);
		double a = x + y;
		double b = Math.sqrt(a);
		System.out.println(b);
	}
}


		

	