import java.util.Scanner;
public class Main {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Sort sort = new Sort();
	int n = Integer.parseInt(scan.nextLine());
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = Integer.parseInt(scan.nextLine());
	}
	sort.shellSort(a, n);
	for (int i = 0; i < n; i++) {
	    System.out.println(a[i]);
	}
    }
}
class Sort {
    int cnt;
    void insertionSort(int[] a, int n, int g) {
	for (int i = g; i < n; i++) {
	    int v = a[i];
	    int j = i - g;
	    while (j >= 0 && a[j] > v) {
		a[j+g] = a[j];
		j = j - g;
		cnt++;
	    }
	    a[j+g] = v;
	}
    }
    void shellSort(int[] a, int n) {
	cnt = 0;
	int max = 1;
	int m = 1;
	int condition = n;
	if (n > 100) {
	    condition = n / 9;
	}
	while ((max * 3 + 1) < condition && m < 100) {
	    m++;
	    max = max * 3 + 1;
	}
	int[] g = new int[m];
	for (int i = 0; i < m; i++) {
	    g[i] = max;
	    max = (max - 1) / 3;
	}
	for (int i = 0; i < m; i++) {
	    insertionSort(a, n, g[i]);
	}
	System.out.println(m);
	if (m != 1) {
	    for (int i = 0; i < m - 1; i++) {
		System.out.print(g[i] + " ");
	    }
	}
	System.out.println(g[m-1]);
	System.out.println(cnt);
    }
}