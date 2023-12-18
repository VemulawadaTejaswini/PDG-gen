import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		int a = sc.nextInt(), b = sc.nextInt();
		String u = sc.next();
		sc.close();
		if (u.equals(s))
			a--;
		else if (u.equals(t))
			b--;
		System.out.println(a + " " + b);
	}
}
