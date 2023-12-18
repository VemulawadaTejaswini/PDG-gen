import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
        	a[i] = sc.nextInt();
        }
        int M = a[0];
        int m = a[0];
        long sum = a[0];
        for (int i=1; i<n; i++) {
        	M = Math.max(M, a[i]);
        	m = Math.min(m, a[i]);
        	sum += a[i];
        }
        System.out.println(m + " " + M + " " + sum);
    }
}

