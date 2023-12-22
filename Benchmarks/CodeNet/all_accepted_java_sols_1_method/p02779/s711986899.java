import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int p = -1;
		for (int tmp : a) {
			if (p == tmp) {
				flag = true;
				break;
			}
			p = tmp;
		}
		if (flag) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
