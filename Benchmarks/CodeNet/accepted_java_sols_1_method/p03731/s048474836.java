import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lt = sc.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (t[i - 1] + lt <= t[i]) {
				count += lt;
			} else {
				count += t[i] - t[i - 1];
			}
		}
		count += lt;
		System.out.println(count);
	}
}