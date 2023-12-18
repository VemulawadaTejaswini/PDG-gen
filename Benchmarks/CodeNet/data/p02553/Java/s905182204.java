import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		long xl = Math.max(a, b);
		long yl = Math.max(c, d);
		
		long xs = Math.min(a, b);
		long ys = Math.min(c, d);
		
		if(xl*yl >= xs*ys) {		
			System.out.println(xl*yl);
		}else {
			System.out.println(xs*ys);
		}
	}
}