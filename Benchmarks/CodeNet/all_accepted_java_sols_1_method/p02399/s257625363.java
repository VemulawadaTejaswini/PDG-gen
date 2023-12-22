import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a / b;
		int r = a % b;
		double A = a;
		double B = b;
		double f = A / B;
		System.out.println(d+" "+r+" " + String.format("%.5f", f));
	}

}