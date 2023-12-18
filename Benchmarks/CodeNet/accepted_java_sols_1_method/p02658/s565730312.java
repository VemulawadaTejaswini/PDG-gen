import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 1;
		long MAX = 1000000000000000000l;
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			long temp = sc.nextLong();
			if (temp==0l) {
				System.out.println(0);
				return ;
			}
			A[i] = temp;
		}
		for (int i=0;i<N;i++) {
			long temp = A[i];
			temp *=sum;
			if (temp<sum||temp>MAX) {
				System.out.println(-1);
				return ;
			}
			sum = temp;
		}
		System.out.println(sum);
	}
}