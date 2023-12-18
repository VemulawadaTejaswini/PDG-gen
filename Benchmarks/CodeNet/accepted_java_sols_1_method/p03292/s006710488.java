import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result =0;
		int A[] = new int[3];
		for (int i=0;i<3;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		result +=Math.abs(A[1]-A[0]);
		result +=Math.abs(A[1]-A[2]);
		System.out.println(result);
	}
}