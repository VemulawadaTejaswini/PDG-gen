import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] Ms = new int[31];
		for (int i=0; i<N; i++) {
			int K = sc.nextInt();
			for (int j=0; j<K; j++) {
				int Aij = sc.nextInt();
				Ms[Aij]++;
			}
		}
		int cnt = 0;
		for (int i=0; i<Ms.length; i++) {
			if ( Ms[i] == N ) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
