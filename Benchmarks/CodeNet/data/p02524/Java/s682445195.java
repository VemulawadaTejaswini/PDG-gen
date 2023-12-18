import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		int a,b,c;

		double w,l,h,s;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		s = a * b / 2;

		w = Math.sqrt(a*a + b*b);

		l = a + b + w;

		h = b * Math.sin(Math.toRadians(c));

		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
	}

}