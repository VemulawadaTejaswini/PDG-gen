import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.parallelSort(A);
		int sum =0;
		for (int i=N-1;i>=0;i-=2) {
			if (i==0) {
				sum +=A[0];
			} else {
				sum +=A[i]-A[i-1];
			}
		}
		System.out.println(sum);
	}
}