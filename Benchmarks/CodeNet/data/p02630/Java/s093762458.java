import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		long A[] = new long[200000];
		for (int i=0;i<N;i++) {
			long temp = sc.nextLong();
			sum +=temp;
			A[(int)temp]++;
		}
		int Q= sc.nextInt();
		for (int i=0;i<Q;i++) {
			long b = sc.nextLong();
			long c = sc.nextLong();
			long count = A[(int)b];
			A[(int)c]+=A[(int)b];
			A[(int)b] = 0;
			sum = count*(c-b)+sum;
			System.out.println(sum);
		}
	}
}
