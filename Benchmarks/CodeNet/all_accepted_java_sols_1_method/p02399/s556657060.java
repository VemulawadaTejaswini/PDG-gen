import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d,r;
		double f;
		
		d = a / b;
		r = a % b;
		f = (double)a / (double)b;
		
		System.out.print(d + " " + r + " " + String.format("%.8f",f));
	}
}
