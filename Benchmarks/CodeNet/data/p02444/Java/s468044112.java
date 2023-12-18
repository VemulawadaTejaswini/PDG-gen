import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j, n, q, b, m, e;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n];
			int[] box = new int[n];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				b = sc.nextInt();
				m = sc.nextInt();
				e = sc.nextInt();
				for(j = b; j < e; j++) {
					box[b + ((j - b + (e - m)) % (e - b))] = a[j];
				}
				for(j = b; j < e; j++) {
					a[j] = box[j];
				}
			}
			for(i = 0; i < n - 1; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println(a[n - 1]);
		}
	}
}

