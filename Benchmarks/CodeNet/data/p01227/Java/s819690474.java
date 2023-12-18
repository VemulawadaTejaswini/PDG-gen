import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 2104
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt();
			int[] dif = new int[n - 1];
			for (int i = 0; i < n - 1; i++) {
				int c = sc.nextInt();
				dif[i] = c - p;
				p = c;
			}
			sort(dif);
			long res = 0;
			for (int i = 0; i < n - k; i++) res += dif[i];
			System.out.println(res);
		}
	}	
}