import java.util.Arrays;
import java.util.Scanner;

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
			int tmp = res;
			while (res > 0 && res < n) {
				if (a[res - 1] == val) {
					--res;
				} else {
					break;
				}
			}
			if (res >= 0) {
				System.out.print(res + " ");
			} else {
				res *= -1;
				tmp *= -1;
				--tmp;
				--res;
				System.out.print(res + " ");
			}
			while (tmp >= 0 && tmp < n - 1) {
				if (a[tmp + 1] == val) {
					++tmp;
				} else {
					break;
				}
			}
			if (tmp >= 0 && tmp < n && a[tmp] == val) {
				++tmp;
			}
			System.out.println(tmp);
		}
		
	}
}

