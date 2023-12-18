import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		long[] a = new long[5];
		int i;
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for(i=0; i<5; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		sc = null;
		long min = min(min(min(a[0],a[1]),min(a[2],a[3])),a[4]);
		if(min >= n) System.out.println(5);
		else if(n % min == 0) {
			System.out.println(n / min + 4);
		} else {
			System.out.println(n / min + 1 + 4);
		}
	}
}