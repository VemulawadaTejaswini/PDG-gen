import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		long a = 0;
		for (int i = 1; i <= n; i++) {
			if(i % k == 0) {
				a++;
			}
		}
		if(k % 2 == 0) {
			long b = 0;
			for (int i = 1; i <= n; i++) {
				if(i % k == k / 2) {
					b++;
				}
			}
			System.out.println((long)(Math.pow(a, 3) + Math.pow(b, 3)));
		} else {
			System.out.println((long)Math.pow(a, 3));
		}
	}
}
	
