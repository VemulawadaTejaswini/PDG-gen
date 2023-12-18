import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0033
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N; 
	static int[] is = new int[10];
	public static void main(String[] args) {
		N = sc.nextInt();
		while (N-- > 0) {
			for (int i = 0; i < 10; i++) is[i] = sc.nextInt();
			if (rec(0, 0, 0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	static boolean rec(int idx, int l, int r) {
		if (idx == 10)
			return true;
		
		boolean ret = false;
		if (l < is[idx])
			ret |= ret | rec(idx + 1, is[idx], r);
		if (r < is[idx])
			ret |= rec(idx + 1, l, is[idx]);
		
		return ret;
	}
	
}