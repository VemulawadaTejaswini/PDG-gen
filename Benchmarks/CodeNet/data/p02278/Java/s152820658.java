import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private int[] a;
	private int[] b;
	
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		int lim = Integer.parseInt(sc.nextLine());
		
		a = new int[lim];		
		b = new int[lim];
		for (int i = 0; i < lim; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = a[i];
		}
		Arrays.sort(b);

		int max = 0;
		HashMap<Integer, ArrayList<Integer[]>> iset = new HashMap<Integer, ArrayList<Integer[]>>();
		for (int i = 0; i < lim; i++) {
			for (int j = (i + 1); j < lim; j++) {
				int sum = b[i] + b[j];
				Integer[] ij = {b[i], b[j]};

				ArrayList<Integer[]> ijlist;
				if (iset.containsKey(sum) == false) {
					ijlist = new ArrayList<Integer[]>();
				} else {
					ijlist = iset.get(sum);
				}
				ijlist.add(ij);
				
				iset.put(sum, ijlist);
				
				if (max < sum) max = sum;
			}
		}

		int ans = 0;
		boolean judge = false;
		for (int i = 0; i <= max; i++) {
			ArrayList<Integer[]> tmp;
			if (iset.containsKey(i) == true) {
				tmp = iset.get(i);
			} else {
				continue;
			}
			
			for (int j = 0; j < tmp.size(); j++) {
				Integer[] ij = tmp.get(j);
				
				int as = ij[0];
				int al = ij[1];
				
				int small = -1;
				int large = -1;
				for (int k = 0; k < lim; k++) {
					if (a[k] == as) {
						small = k;
					} else if (a[k] == al) {
						large = k;
					}
					
					if ((small != -1) && (large != -1)) break;
				}

				if (a[large] == b[small]) {
					a[large] = a[small];
					a[small] = b[small];
					
					ans = ans + i;

					tmp.remove(j);
					iset.put(i, tmp);
					i = -1;
				}
				
				judge = true;
				for (int k = 0; k < lim; k++) {
					if (a[k] != b[k]) {
						judge = false;
						break;
					}
				}
				if (judge) break;
			}
			if (judge) break;
		}
		
		System.out.println(ans);
	}
}