import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int count = 0;
		while (true) {
			boolean bre = false;
			int start = 0;
			for (int i = 0; i < n; i++) {
				if (h[i] != 0) {
					start = i;
					bre = true;
					break;
				}
			}
			if (!bre) {
				break;
			}
			for (int i = start; i < n; i++) {
				if (h[i] == 0) {
					break;
				} else {
					h[i]--;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}