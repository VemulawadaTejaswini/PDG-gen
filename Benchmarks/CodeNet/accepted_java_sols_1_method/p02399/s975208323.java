import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int d = 0; int r = 0;
		double f = 0;
		d = a / b;
		r = a % b;
		double aa = (double)a;
		double bb = (double)b;
		f = aa / bb;
		System.out.printf (d +" "+ r +" " + "%.5f",f);
	}
}
