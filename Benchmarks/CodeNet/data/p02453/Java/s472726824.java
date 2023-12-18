import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int val = sc.nextInt();
			int res = Arrays.binarySearch(a, val);
			while (res > 0 && res < n) {
				if (a[res - 1] == val) {
					--res;
				} else {
					break;
				}
			}
			if (res >= 0) {
				System.out.println(res);
			} else {
				res *= -1;
				--res;
				System.out.println(res);
			}
		}
		
	}
}

