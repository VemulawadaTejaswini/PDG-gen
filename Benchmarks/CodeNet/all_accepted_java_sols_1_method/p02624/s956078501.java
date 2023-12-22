import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N+1];
		long result=0;
		for (int i=1;i<=N;i++) {
			for (int j=1;j*i<=N;j++) {
				A[j*i]++;
			}
		}
		for (int i=1;i<=N;i++) {
			result +=i*A[i];
		}
		System.out.println(result);
	}
}