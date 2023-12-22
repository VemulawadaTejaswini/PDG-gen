import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		
		while (sc.hasNextInt()) {
			a[sc.nextInt() - 1]++;
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < n / 2; i++) {
			int tmp = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = tmp;
		}
		
		int s = 0;
		for (int i = 0; i < k; i++) {
			s += a[i];
		}
		System.out.println(n - s);
	}
}
