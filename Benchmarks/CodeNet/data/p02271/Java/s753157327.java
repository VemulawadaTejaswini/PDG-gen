import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, q, m; 
		int[] a;
		
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			m = sc.nextInt();
			if (checkpossible(a,m,n)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	public static boolean checkpossible(int[] a, int m, int n){
		if (m==0) {
			return true;
		} else if (n == 0) {
			return false;
		} else {
			return (checkpossible(a,m,n-1) || checkpossible(a,m-a[n-1],n-1));
		}
	}
}
