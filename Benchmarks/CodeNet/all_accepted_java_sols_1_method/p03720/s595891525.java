import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		for (int i=0; i<M; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		Integer[] sp = new Integer[N+1];
		Arrays.fill(sp, 0);
		for (int i=0; i<M; i++) {
			sp[A[i]] ++;
			sp[B[i]] ++;
		}
		for (int i=1; i<N+1; i++) {
			System.out.println(sp[i]);
		}
	}
}
