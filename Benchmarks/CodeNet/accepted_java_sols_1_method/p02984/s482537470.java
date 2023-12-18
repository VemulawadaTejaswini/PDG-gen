import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int result[] = new int[N];
		int sum = 0;
		for (int i=0;i<N;i++) {
			A[i] =sc.nextInt();
			sum +=A[i];
		}
		int temp =0;
		for (int i=1;i<N;i+=2) {
			temp +=A[i];
		}
		result[0] = sum -temp*2;
		for (int i=1;i<N;i++) {
			result[i] = A[i-1]*2-result[i-1];
		}
		for (int i=0;i<N;i++) {
			System.out.println(result[i]);
		}
	}
}