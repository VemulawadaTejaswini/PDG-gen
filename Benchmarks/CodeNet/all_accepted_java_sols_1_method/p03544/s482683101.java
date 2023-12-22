import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A[] = new long[87];
		A[0]=2;
		A[1]=1;
		for (int i=2;i<87;i++) {
			A[i] = A[i-1]+A[i-2];
		}
		int N = sc.nextInt();
		System.out.println(A[N]);
	}
}