import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[n];
		int[] p = new int[m];
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
		}
		int zeroCount = 0;
		int oneCount  = 0;
		for(int i = 0; i < n; i++) {
			if(b[i] == 1) {
				oneCount++;
			}
			else {
				zeroCount++;
			}
		}
		int ACount = 0;
		int BCount = 0;
		for(int i = 0; i < m; i++) {
			if(i % 2 == 0) {
				ACount += p[i];
			}
			else {
				BCount += p[i];
			}
		}
		int min = Integer.MAX_VALUE;
		
		if(ACount == zeroCount && BCount == oneCount) {
			//StartZero
			int count = 0;
			int[] check = new int[n];
			int id = 0;
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < p[i]; j++) {
					check[id++] = i % 2;
				}
			}
			int[] tmp = Arrays.copyOf(b, b.length);
			for(int i = 0; i < n; i++) {
				if(check[i] != tmp[i]) {
					int target = 0;
					for(int j = i+1; j < n; j++) {
						if(tmp[j] == check[i]) {
							target = j;
							break;
						}
					}
					for(int j = target; j > i; j--) {
						swap(tmp,j,j-1);
						count++;
					}
				}
			}
			min = Math.min(count, min);
		}
		if(ACount == oneCount && BCount == zeroCount) {
			//StartOne
			int count = 0;
			int[] check = new int[n];
			int id = 0;
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < p[i]; j++) {
					check[id++] = (i+1) % 2;
				}
			}
			int[] tmp = Arrays.copyOf(b, b.length);
			for(int i = 0; i < n; i++) {
				if(check[i] != tmp[i]) {
					int target = 0;
					for(int j = i+1; j < n; j++) {
						if(tmp[j] == check[i]) {
							target = j;
							break;
						}
					}
					for(int j = target; j > i; j--) {
						swap(tmp,j,j-1);
						count++;
					}
				}
			}
			min = Math.min(count, min);
		}
		System.out.println(min);
		
		
		
	}
	static void swap(int[] a, int b, int c) {
		int tmp = a[b];
		a[b] = a[c];
		a[c] = tmp;
	}
 }