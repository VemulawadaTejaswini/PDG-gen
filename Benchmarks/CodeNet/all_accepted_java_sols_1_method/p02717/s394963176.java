import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmpa = 0;
		int tmpb = 0;
		int tmpc = 0;
		tmpa = b;
		tmpb = a;
		a = tmpa;
		b = tmpb;
		tmpa = c;
		tmpc = a;
		a = tmpa;
		c = tmpc;

		System.out.println(a +" "+b + " " +c);

	}
}