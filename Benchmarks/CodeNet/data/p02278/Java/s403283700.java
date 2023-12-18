import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int lim;
	
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
		for (int i = 0; i < lim; i++) {
			if (a[i] == b[i]) continue;
			for (int j = (i + 1); j < lim; j++) {
				if (a[j] == b[j]) continue;
				
				Integer[] ij = {b[i], b[j]};
				iset.add(ij);
			}
		}
		
		int min = 0;
		for (int i = 0; i < iset.size(); i++) {
			int tmp = swap(i, 0);
			
			if ((tmp != -1) && ((min == 0) || (min > tmp))) min = tmp;
		}
		
		System.out.println(min);
	}
	
	public int swap(int index, int ans) {
		Integer[] ij = iset.get(index);
		iset.remove(index);

		int small = -1;
		int large = -1;
		for (int i = 0; i < lim; i++) {
			if (a[i] == ij[0]) {
				small = i;
			} else if (a[i] == ij[1]) {
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
			iset.add(index, ij);
			return -1;
		}
		
		boolean flag = true;
		for (int i = 0; i < lim; i++) {
			if (a[i] != b[i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			iset.add(index, ij);
			return ans;
		}
		
		int min = 0;
		for (int i = 0; i < iset.size(); i++) {
			int tmp = swap(i, ans);
			
			if ((tmp != -1) && ((min == 0) || (min > tmp))) min = tmp;
		}
		
		iset.add(index, ij);
		return min;
	}
}