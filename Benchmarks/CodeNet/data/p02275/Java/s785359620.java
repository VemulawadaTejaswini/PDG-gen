import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[10000];
		int k = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			k = Math.max(k, a[i]);
			c[a[i]]++;
		}
		sc.close();
		countingSort(a, b, c, k);
		StringBuilder sb = new StringBuilder();
		sb.append(b[0]);
		for (int i = 1; i < n; i++) {
			sb.append(' ').append(b[i]);
		}
		System.out.println(sb.toString());
	}

	private static void countingSort(int[] a, int[] b, int[] c, int k) {
		for (int i = 1; i <= k; i++) {
			c[i] += c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			c[a[i]]--;
			b[c[a[i]]] = a[i];
		}		
	}
}

