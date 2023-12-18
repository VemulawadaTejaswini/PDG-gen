import java.util.*;

public class mergeSort {
	int count = 0;
	public static void main(String[] args) {
		new Main().runSort();
	}
	
	public void runSort() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		sorting(l, 0, n);
		System.out.print(l[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " +l[i]);
		}
		System.out.println();
		System.out.println(count);
	}

	public void sorting(int[] l, int nl, int nr) {
		if (nl + 1 < nr) {
			int nm = (nl + nr) / 2;
			sorting(l, nl, nm);
			sorting(l, nm, nr);
			merging(l, nl, nm, nr);
		}
	}

	public void merging(int[] list, int nl, int nm, int nr) {
		int n1 = nm - nl;
		int n2 = nr - nm;
		int[] l = new int[n1 + 1];
		int[] r = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			l[i] = list[nl + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = list[nm + i];
		}
		l[n1] = Integer.MAX_VALUE;
		r[n2] = Integer.MAX_VALUE;

		int LEFT = 0;
		int RIGHT = 0;
		for (int i = nl; i < nr; i++) {
			if (l[LEFT] <= r[RIGHT]) {
				list[i] = l[LEFT++];
			} else {
				list[i] = r[RIGHT++];
			}
			count++;
		}
	}

}
