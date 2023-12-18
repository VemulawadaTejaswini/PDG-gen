import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 2100
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			int n = sc.nextInt(), p = sc.nextInt(), low = 0, high = 0, c = 0;
			for (int i = 1; i < n; i++) {
				c = sc.nextInt();
				low = min(low, c - p);
				high = max(high, c - p);
				p = c;
			}
			System.out.println(high +  " " + abs(low));
		}
	}
}