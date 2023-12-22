import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String b1 = sc.next();

		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b1);

		int d = a/b;
		int r = a%b;
		double f = a/(double)b;

		System.out.println(d);
		System.out.println(r);

		System.out.println(String.format("%f", f));
	}
}