import java.util.Scanner;

class Main {public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int s = n;
		int m = 0;
		int g[] = new int[n];
		while(s > 0) {
			s = s / 2;
			g[m] = s;
			m++;
		}
		
		//shellSort
		int cnt = 0;
		for(int i = 0; i < m; i++) {
			//insertionSort
			for(int h = g[i]; h <= n-1; h++) {
				int v = a[h];
				int j = h - g[i];
				while(j >= 0 && a[j] > v) {
					a[j+g[i]] = a[j];
					j = j - g[i];
					cnt++;
				}
				a[j+g[i]] = v;
			}
		}
		
		System.out.println(m);
		for(int i = 0; i < m; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(g[i]);
		}
		System.out.println("\n" + cnt);
		for(int i = 0; i < n; i++) System.out.println(a[i]);
	}
}
