import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String c;
		while(true) {
			a = sc.nextInt();
			c = sc.next();
			b = sc.nextInt();
			if(c.equals("?")) {
				break;
			} else if(c.equals("+")) {
				System.out.println(a+b);
			} else if(c.equals("-")) {
				System.out.println(a-b);
			} else if(c.equals("*")) {
				System.out.println(a*b);
			} else if(c.equals("/")) {
				System.out.println(a/b);
			}
		}
	}
}