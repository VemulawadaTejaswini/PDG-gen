import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[M];
		for (int i=0;i<N;i++) {
			int K =sc.nextInt();
			for (int j =0;j<K;j++) {
				int t = sc.nextInt();
				A[t-1]++;
			}
		}
		int count=0;
		for (int i=0;i<M;i++) {
			if (A[i]==N) {
				count ++;
			}
		}
		System.out.println(count);
	}
}
