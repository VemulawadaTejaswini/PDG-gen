import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String y = s.next();

		if (n < y.length()) {
			y += y.substring(0, n);
			System.out.println(y);

		} else
			System.out.println(y);

	}
}

