import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
   
   
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				
			}
			for(int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int[] a2 = new int[n];
			int[] b2 = new int[n];
			for(int i = 0; i < n; i++) {
				a2[n - i - 1] = a[i];
				b2[n - i - 1] = b[i];
			}
			a = a2;
			b = b2;
			int ans = -1;
			for(int k = 0; k < n/2; k++) {
				if(a[k*2] > b[k]) {
					ans = k*2+1;
					break;
				}
			}
			if(ans == -1) {
				System.out.println("NA");
			}
			else {
				System.out.println(ans);
			}
		}
		
		
		
	}
	
}