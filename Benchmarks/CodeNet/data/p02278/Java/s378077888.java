import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int lim;
	private int wall;
	
	private int[] a;
	private int[] b;
	
	private ArrayList<Integer[]> iset;
	
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		lim = Integer.parseInt(sc.nextLine());
		
		a = new int[lim];		
		b = new int[lim];
		for (int i = 0; i < lim; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = a[i];
		}
		Arrays.sort(b);
		
		iset = new ArrayList<Integer[]>();
		for (int i = 1; i < lim * 2; i++) {
			for (int n0 = 0; n0 < i; n0++) {
				int n1 = i - n0;
				if (n0 >= n1) break;
				if (n1 >= lim) continue;

				if ((a[n0] == b[n0]) || (a[n1] == b[n1])) continue;

				Integer[] ij = {b[n0], b[n1]};
				iset.add(ij);
			}
		}
		
		wall = 0;
		for (int i = 0; i < iset.size(); i++) {
			Integer[] ij = iset.get(i);
			
			iset.remove(i);
			swap(ij[0], ij[1], 0);
			iset.add(i, ij);
		}
		
		System.out.println(wall);
	}
	
	public void swap(int n0, int n1, int ans) {
		int small = -1;
		int large = -1;
		for (int i = 0; i < lim; i++) {
			if (a[i] == n0) {
				small = i;
			} else if (a[i] == n1) {
				large = i;
			}
			
			if ((small != -1) && (large != -1)) break;
		}
		
		if ((a[small] == b[large]) || (a[large] == b[small])) {
			int tmp = a[small];
			a[small] = a[large];
			a[large] = tmp;
			
			ans = ans + a[small] + a[large];
		} else {
			return;
		}
		
		boolean flag = true;
		for (int i = 0; i < lim; i++) {
			if (a[i] != b[i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			int tmp = a[small];
			a[small] = a[large];
			a[large] = tmp;
			
			if ((wall == 0) || (wall > ans)) wall = ans;
			return;
		}
		
		for (int i = 0; i < iset.size(); i++) {
			Integer[] ij = iset.get(i);

			if ((wall != 0) && (wall < (ans + ij[0] + ij[1]))) {
				int tmp = a[small];
				a[small] = a[large];
				a[large] = tmp;
				return;
			}
			
			iset.remove(i);
			
			swap(ij[0], ij[1], ans);
			
			iset.add(i, ij);
		}

		int tmp = a[small];
		a[small] = a[large];
		a[large] = tmp;
		return;
	}
}