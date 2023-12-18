import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] A = new int[n];
		
		for (int i = 0; i < n; i ++) {
			A[i]  = scanner.nextInt();
		}
		
		int q = scanner.nextInt();

		for (int i = 0; i < q; i ++) {
			System.out.println(resolve(A, 0, 0, scanner.nextInt()) ? "yes": "no");
		}
		
		scanner.close();
	}
	
	public static boolean resolve(int[] A, int i, int sum, int m) {
		if(sum == m) return true;
		if(i >= A.length) return false;
		return resolve(A, i + 1, sum, m) || resolve(A, i + 1, sum + A[i], m);
	}
} 

