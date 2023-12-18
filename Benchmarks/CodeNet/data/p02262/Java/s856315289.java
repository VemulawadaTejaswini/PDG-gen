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
    	int m = (n - 1) / 3 + 1;
    	if (m < 10) {
        	g = new int[m];
        	for (int i = m - 1; i >= 0; i --) {
        		g[m - 1 - i] = 3 * i + 1;
        	}
    	} else {
    		ArrayList<Integer> arrayG = new ArrayList<Integer>();
    		arrayG.add(1);
    		for (int next = arrayG.get(0) * 3 + 1, i = 1; next < n; i++, next = arrayG.get(i - 1) * 3 + 1) {
    			arrayG.add(next);
    		}
    		m = arrayG.size();
    		g = new int[m];
    		for (int i = 0; i < m; i++) {
    			g[i] = arrayG.get(m - i - 1);
    		}
    	}
    	
    	for (int i = 0; i < m; i++) {
    		insertionSort(data, n, g[i]);
    	}

    	// m
    	System.out.println(m);
    	// g
		StringBuffer printData = new StringBuffer();
		for (int i = 0; i < g.length; i++) {
			printData.append(g[i]);
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
			for (; j >= 0 && data[j] > v;) {
				data[j + g] = data[j];
				j -= g;
				cnt++;
			}
			data[j + g] = v;
		}
		return;
	}
}