import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int l = 0, r = 0;
		for (int i = 0; i < q; i++) {
			int p = sc.nextInt();
			String c = sc.next();
			int n = sc.nextInt();
			if (c.equals("("))
				l += n;
			else
				r += n;
			if (l == r)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		sc.close();
	}
}