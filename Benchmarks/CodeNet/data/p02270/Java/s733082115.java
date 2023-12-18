import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int k;
	static int[] w;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		n = scanner.nextInt();
		k = scanner.nextInt();
		
		w = new int[n];

		int i = 0, j = 0;
		
		for (int l = 0; l < n; l ++) {
			w[l]  = scanner.nextInt();
			j += w[l];
		}

		scanner.close();
		
		while (i < j) {
			int p = (i + j) / 2;
			if (f(p) < n) {
				i = p + 1;
			} else {
				j = p;
			}
		}

		System.out.println(i);
	} 

	static int f(int p) {
		int v = 0;

		for (int i = 0; i < k; i ++) {
			for (int v0 = w[v++]; v0 <= p; v0 += w[v++]) {
				if (w[v - 1] > p) {
					return 0;
				}
				if (v >= n) {
					return n; 
				}
			}
			v--;
		}

		return v;
	} 
} 

