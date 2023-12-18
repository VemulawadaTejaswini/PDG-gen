import java.util.Scanner;
import java.util.*;
public class Main {
	static int[] ar;
	static int n;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		int m = stdIn.nextInt();
		ar = new int[2*n];
		for(int i = 0; i < 2 * n; i++) {
			ar[i] = i+1;
		}
		for(int i = 0; i < m; i++) {
			int tmp = stdIn.nextInt();
			if(tmp == 0) rs();
			else cut(tmp);
		}
		
		for(int i = 0; i < 2 * n; i++) {
			System.out.println(ar[i]);
		}
	}
	
	static void rs(){
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = ar[i];
		}

		int[] b = new int[n];
		for(int i = 0; i< n; i++) {
			b[i] = ar[i + n];
 		}
		
		for(int i = 0; i < 2*n; i++) {
			if(i % 2 == 0) {
				ar[i] = a[i / 2 ];
			}
			else {
				ar[i] = b[i / 2 ];
			}
		}
	}
	static void cut(int k) {
		int[] a = new int[k];
		for(int i = 0; i< k; i++) {
			a[i] = ar[i];
		}
		
		int[] b = new int[2 * n - k];
		for(int i = 0; i < 2 * n - k; i++) {
			b[i] = ar[i + k];
		}
		for(int i = 0; i < 2 * n - k; i++) {
			ar[i] = b[i];
		}
		
		for(int i = 0; i < k; i++) {
			ar[2 * n - k + i] = a[i];
		}
		
	}
	

}