import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int a,b;
		double db;

		String str;

		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();

		db = a/b;

		str = String.format("%.5f", db);

		System.out.println(a/b + " " + a%b + " "+ str );
		scan.close();
	}
}