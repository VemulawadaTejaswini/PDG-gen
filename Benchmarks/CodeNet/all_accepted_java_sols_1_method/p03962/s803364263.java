import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int a,b,c;
		Scanner foo = new Scanner(System.in);
		a = new Integer(foo.next()).intValue();
		b = new Integer(foo.next()).intValue();
		c = new Integer(foo.next()).intValue();
		if (a == b && b == c) {
			System.out.println("1");
		} else if (a == b || b == c || c == a) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
    }
}
