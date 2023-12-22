import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[3];
		A[0] = sc.nextInt();
		A[1] = sc.nextInt();
		A[2] = sc.nextInt();
		int K = sc.nextInt();
		Arrays.parallelSort(A);
		System.out.println(A[0]+A[1]+(int)(A[2]*Math.pow(2, K)));
	}
}