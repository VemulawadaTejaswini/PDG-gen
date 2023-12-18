import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(sc.next());
			d[i] = Integer.parseInt(sc.next());
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			for (int j = 0; j < n; j++) {
				if (c[j] < min) {
					min = c[j];
					index = j;
				}
			}
			c[index] = Integer.MAX_VALUE;
			int mi = -1;
			int in = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] < min && b[j] < d[index] && b[j] > mi) {
					mi = b[j];
					in = j;
				}
			}
			if (mi != -1) {
				count++;
				a[in] = Integer.MAX_VALUE;
			}
		}
		System.out.println(count);
	}
}