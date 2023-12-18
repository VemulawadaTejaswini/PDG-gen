import java.io.*;
import java.util.*;


public class Main {
	static int n = 0;
	
	public static void counting_sort(int[] a) {
		// b is the sorted array
		int[] b = new int[n];
		
		// c is the counting array
		int[] c = new int[2000000+1];
		Arrays.fill(c, 0);
		
		// counting occurrences of each a[i]
		for (int i = 0; i < n; i++) c[a[i]]++;
		
		// count the number less than or equal to a[i]
		for (int i = 1; i < n; i++) c[i] = c[i] + c[i-1];
	
		
		// with each a[i], place it in the right position
		for (int i = n-1; i >= 0; i--) {
			// a[i] will be placed in the index that right after the number of elements <= a[i]
			b[c[a[i]]-1] = a[i];
			// ...
			c[a[i]]--;
		}
		
		for (int i = 0; i < n-1; i++) System.out.print(b[i] + " ");
		System.out.println(b[n-1]);
	}
	
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		counting_sort(a);
	}
}