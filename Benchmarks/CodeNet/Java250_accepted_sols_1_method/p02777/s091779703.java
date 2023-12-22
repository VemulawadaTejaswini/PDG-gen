import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a,b;
		String s,t,c;

		Scanner sc = new Scanner(System.in);

		s = sc.next();
		t = sc.next();

		a = sc.nextInt();
		b = sc.nextInt();

		c = sc.next();

		if (s.equals(c) ) {
			a = a - 1;
		} else {
			b = b - 1;
		}

		System.out.println(a + " " + b);

	}

}
