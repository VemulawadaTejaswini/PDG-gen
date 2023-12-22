import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		boolean bre = false;
		int last = h[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (h[i] - last > 1) {
				bre = true;
				break;
			} else if (h[i] - last == 1) {
				last = h[i] - 1;
			} else {
				last = h[i];
			}
		}
		if (bre) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}