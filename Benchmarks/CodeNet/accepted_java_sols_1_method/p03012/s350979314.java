import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] w = new int[n];
		for(i = 0; i <n; i++) {
			w[i] = Integer.parseInt(sc.next());
		}
		sc.close();
//		Arrays.sort(w);
		int[] a = new int[n];
		int[] b = new int[n];
		a[0] = w[0];
		b[n-1] = w[n-1];
		for(i = 1; i <n; i++) {
			a[i] = a[i-1] + w[i];
			b[n-i-1] = b[n-i] + w[n-1-i];
		}
		int dif = 100*n;
		int min = 0;
		for(i = 0; i <n-1; i++) {
			min = Math.abs(a[i] - b[i+1]); 
			if(min < dif) {
				dif= min;
			}
		}
		System.out.println(dif);
	}
}
