import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int N = sc.nextInt();
		long A[] = new long[N+1];
		long B[] = new long[60];
		B[0]=1;
		long result[] = new long[N+1];
		for (int i=0;i<=N;i++) {
			A[i] = sc.nextLong();
		}
		long temp =0;
		result[N]= A[N];
		for (int i=N;i>=1;i--) {
			result[i-1]= A[i-1]+result[i];
		}
		long tempPoint=1;
		for (int i=0;i<=N;i++) {
			if (tempPoint<A[i]) {
				System.out.println(-1);
				return ;
			}
			if (tempPoint<result[i]) {
				sum +=tempPoint;
			} else {
				sum +=result[i];
			}
			tempPoint-=A[i];
			tempPoint*=2;
		}
		System.out.println(sum);
	}
}