import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		for (int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int f = A[0];
		int l = A[A.length-1];
		System.out.println(l-f);
	}
}
