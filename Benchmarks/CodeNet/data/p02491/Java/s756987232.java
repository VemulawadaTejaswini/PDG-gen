import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		double da = (double)a;
		double db = (double)b;
		int d = a/b;
		int r = a%b;
		double f = da/db;
		System.out.println(d+" "+r+" "+f);
	}
}