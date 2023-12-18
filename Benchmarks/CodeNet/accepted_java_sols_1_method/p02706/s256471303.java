import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] A = new int[M];
		int total = 0;
		for (int i=0; i<M; i++) {
			A[i] = in.nextInt();
			total = total + A[i];
		}
		
		if (N >= total) {
			System.out.println(N - total);
		} else {
			System.out.println("-1");
		}
		
	}
}
