import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] data = new int[n];
		
    	for (int i = 0; i < n; i++) {
    		data[i] = sc.nextInt();
    	}
    	
    	// Shell Sort
    	cnt = 0;
    	int[] g;

//    	int m = (n - 1) / 3 + 1;
//    	if (m > 100) {
//    		m = 100;
//    	}
//    	g = new int[m];
//    	for (int i = m - 1; i >= 0; i --) {
//    		g[i] = 3 * i + 1;
//    	}
    	
    	int m = (int)Math.pow(n, 1.25);
    	if (m > 100) {
    		m = 100;
    	}
		g = new int[m];
		int ii = 0;
		g[ii] = 1;
		for (ii = 1; ii < m; ii++) {
			int next = g[ii - 1] * 3 + 1;
			if (next > n) {
				break;
			}
			g[ii] = next;
		}
		m = ii;
    	
    	for (int i = 0; i < m; i++) {
    		insertionSort(data, n, g[m - 1 - i]);
    	}

    	// m
    	System.out.println(m);
    	// g
		StringBuffer printData = new StringBuffer();
		for (int i = 0; i < m; i++) {
			printData.append(g[m - 1 - i]);
			printData.append(" ");
		}
		printData.delete(printData.length() - 1, printData.length());
		System.out.println(printData);
    	// cnt
    	System.out.println(cnt);
    	// data
		for (int i = 0; i < data.length; i++) {
	    	System.out.println(data[i]);
		}

    	sc.close();
	}
	
	private static void insertionSort(int[] data, int n, int g) {
		for (int i = g; i < n; i++) {
			int v = data[i];
			int j = i - g;
			int tmp;
//			for (; j >= 0 && data[j] > v;) {
//			    data[j + g] = data[j];
			for (; j >= 0 && (tmp = data[j]) > v;) {
				data[j + g] = tmp;
				j -= g;
				cnt++;
			}
			data[j + g] = v;
		}
		return;
	}
}