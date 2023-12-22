import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] K = new int[N];
		int[] A = new int[M+1];
		int a = 0;
		for(int i=0; i<N; i++) {
			K[i] = sc.nextInt();
			for(int j=0; j<K[i]; j++) {
				int b = sc.nextInt();
				A[b]++;
			}
		}
		sc.close();
		for(int i=1; i<=M; i++) {
			if(A[i] == N) {
				a++;
			}
		}
		System.out.println(a);
	}

}