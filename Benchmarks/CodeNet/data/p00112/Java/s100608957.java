import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			long[] a = new long[n];
			long ans = 0;
			long v = list.get(0);
			a[0] = 0;
			for (int i = 1; i < n; i++) {
				a[i] = v;
				v += list.get(i);
				ans += a[i];
			}
			System.out.println(ans);
		}
	}
}