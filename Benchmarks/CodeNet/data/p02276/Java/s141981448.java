import java.util.Scanner;

public class Main {
	private int[] a;
	
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		int lim = Integer.parseInt(sc.next());
		
		a = new int[lim];
		for (int i = 0; i < lim; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		partition(0, lim - 1);
		
		StringBuilder sb = new StringBuilder();
		sb.append(a[0]);
		for (int i = 1; i < lim; i++) {
			sb.append(" " + a[i]);	
		}
		System.out.println(sb);
	}
	
	private int partition(int p, int r) {
		int x = a[r];
		int i = p - 1;
		
		int tmp;
		
		for (int j = p; j < r; j++) {
			if (a[j] <= x) {
				i = i + 1;
				
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		
		tmp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = tmp;
		return i++;
	}
}