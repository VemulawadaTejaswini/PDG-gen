import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
//		int b = sc.nextInt();
		double res = 0;
//		String s = sc.next();
//		String res = "";

		double da = a;

		res = (da/3)*(da/3)*(da/3);
		System.out.printf("%f", res);
		//System.out.println(res);
	}
}
