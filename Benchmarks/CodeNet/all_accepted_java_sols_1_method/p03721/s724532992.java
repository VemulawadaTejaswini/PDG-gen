import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());
		int[] a = new int[n];
		long[] d = new long[100001];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			d[a[i]] += Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		int[] b = new int[n];
		int in = 0;
		for (int i = 0; i < n;) {
			int index = i;
			while (i < n && a[i] == a[index])
				i++;
			b[in++] = a[index];
		}
		long count = 0;
		for (int i = 0; i < n; i++) {
			count += d[b[i]];
			if (count >= k) {
				System.out.println(b[i]);
				break;
			}
		}
	}
}