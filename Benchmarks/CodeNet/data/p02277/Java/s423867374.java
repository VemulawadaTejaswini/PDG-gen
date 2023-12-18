import java.util.Scanner;

public class Main {
	private int[] a;
	private String[] ori;
	private String[] se;
	
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		int lim = Integer.parseInt(sc.nextLine());
		
		a = new int[lim];
		ori = new String[lim];
		se = new String[lim];
		for (int i = 0; i < lim; i++) {
			ori[i] = sc.nextLine();
			se[i] = ori[i];
			a[i] = Integer.parseInt(se[i].split(" ")[1]);
		}
		quickSort(0, (lim - 1));
		
		boolean flag = true;
		int scope = a[0];
		for (int i = 0; i < lim; i++) {
			int j = 0;
			for (j = 0; j < lim; j++) {
				if (se[i].equals(ori[j]) && (i != (lim - 1))) {
					if (scope == a[i + 1]) {
						i++;
					} else {
						break;
					}
				}
			}
			
			if (i != (lim - 1)) {
				if (j == lim) {
					flag = false;
					break;
				}
				scope = a[i + 1];
			}
			System.out.println(a[i] + " : " + se[i]);
		}
		if (flag) System.out.println("Stable");
		else System.out.println("Not stable");
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lim; i++) {
			sb.append(se[i] + "\n");	
		}
		System.out.print(sb);
	}
	
	private void quickSort(int p, int r) {
		if (p < r) {
			int q = partition(p, r);
			quickSort(p, (q - 1));
			quickSort((q + 1), r);
		}
		
	}
	
	private int partition(int p, int r) {
		int x = a[r];
		int i = p - 1;
		
		int tmp;
		String stmp;
		
		for (int j = p; j < r; j++) {
			if (a[j] <= x) {
				i = i + 1;
				
				tmp = a[i];
				stmp = se[i];
				
				a[i] = a[j];
				se[i] = se[j];
				
				a[j] = tmp;
				se[j] = stmp;
			}
		}
		
		tmp = a[i + 1];
		stmp = se[i + 1];
		
		a[i + 1] = a[r];
		se[i + 1] = se[r];
		
		a[r] = tmp;
		se[r] = stmp;
		return (i + 1);
	}
}