import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = Long.parseLong(in.next());
		String b = in.next();
		long bb = 0;
		int times = 100;
		for(int i = 0; i < 4; i++) {
			if(!b.substring(i, i + 1).equals(".")) {
				bb += times * Integer.parseInt(b.substring(i, i + 1));
				times /= 10;
			}
		}
		long c = a * bb;
		c -= c % 100;
		c /= 100;
		System.out.println(c);
	}
}