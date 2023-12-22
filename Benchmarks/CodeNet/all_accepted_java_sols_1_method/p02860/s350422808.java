import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		String s = in.next();
		if(n % 2 != 0) {
			System.out.println("No");
		}else {
			int half = n / 2;
			String t1 = s.substring(0, half);
			String t2 = s.substring(half, n);
			if(t1.equals(t2)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}