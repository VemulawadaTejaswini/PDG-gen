import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		
		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];
		
		for(int i = 0; i < X; i++) {
			A[i] = sc.nextLong();
		}
		
		for(int i = 0; i < Y; i++) {
			B[i] = sc.nextLong();
		}
		
		for(int i = 0; i < Z; i++) {
			C[i] = sc.nextLong();
		}
		
		long[] del = new long[X * Y];
		int p = 0;
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++) {
				del[p] = A[i] + B[j];
				p++;
			}
		}
		Arrays.sort(del);
		long[] del2 = new long[Z * K];
		int x = Math.max(del.length - 1 - K, -1);
		int q = 0;
		for(int i = del.length - 1; i > x; i--) {
			for(int j = 0; j < Z; j++) {
				del2[q] = del[i] + C[j];
				q++;
			}
		}
		Arrays.sort(del2);
		for(int i = del2.length - 1; i > del2.length - 1 - K; i--) {
			System.out.println(del2[i]);
		}
	}
}
