import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lim = Integer.parseInt(sc.next());
		
		int max = 0;
		int[] a = new int[lim];
		int[] b = new int[lim];
		
		for (int i = 0; i < lim; i++) {
			a[i] = Integer.parseInt(sc.next());
			if (max < a[i]) max = a[i];
		}
		
		int[] c = new int[max + 1];
		for (int i = 0; i < (max + 1); i++) {
			c[i] = 0;
		}
		
		for (int i = 0; i < lim; i++) {
			c[a[i]] = c[a[i]] + 1;
		}
		
		for (int i = 1; i < (max + 1); i++) {
			c[i] = c[i] + c[i - 1];
		}
		
		for (int i = (lim - 1); i >= 0; i--) {
			b[(c[a[i]] - 1)] = a[i];
			c[a[i]] = c[a[i]] - 1;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(b[0]);
		for (int i = 1; i < lim; i++) {
			sb.append(" " + b[i]);
		}
		System.out.println(sb.toString());
	}
}