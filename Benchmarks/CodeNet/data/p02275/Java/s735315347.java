import java.io.*;
import java.util.*;

public class Main{
	public static int count = 0;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i<n ; i++ ) {
			int stock = sc.nextInt();
			max = Math.max(max,stock);
			a[i] = stock;
		}
		int[] c = new int[max+1];

		for (int i = 0; i<=max ; i++) {
			c[i] = 0;
		}

		for (int j = 0; j<n ; j++ ) {
			c[a[j]]++;
		}

		for (int i = 1; i<=max ; i++ ) {
			c[i] = c[i] + c[i-1];
		}

		for (int j = n-1; j>=0 ; j-- ) {
			b[c[a[j]]-1] = a[j];
			c[a[j]]--;
		}

		for (int i = 0; i<n ; i++ ) {
			if (i != n-1) {
				System.out.print(b[i] + " ");
			}else{
				System.out.println(b[i]);
			}
		}
	}
}