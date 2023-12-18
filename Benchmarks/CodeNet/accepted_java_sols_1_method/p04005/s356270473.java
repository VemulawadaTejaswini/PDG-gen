import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A[] = new long[3];
		for (int i=0;i<3;i++) {
			A[i] = sc.nextLong();
			if (A[i]%2==0) {
				System.out.println(0);
				return ;
			}
		}
		Arrays.parallelSort(A);
		System.out.println(A[0]*A[1]);
	}
}