
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String in = sc.next();
		if(s.equals(in)) {
			a--;
		} else if(t.equals(in)) {
			b--;
		}
		System.out.println(a + " " + b);
	}

}
