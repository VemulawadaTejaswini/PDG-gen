import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();

		int[] V = new int[N];
		int[] C = new int[N];

		for (int i = 0; i < C.length; i++) {
			C[i] = sc.nextInt();
		}

		for (int i = 0; i < V.length; i++) {
			V[i] = sc.nextInt();
		}

		int max = 0;
		for (int i = 0; i < (1<<N); i++) {
			int Xsum = 0;
			int Ysum = 0;
			for (int j = 0; j < N; j++) {
				if (((i>>j) & 1)==1) {
					//合致
					Xsum += C[j];
					Ysum += V[j];
				}
			}
			if (Xsum-Ysum >= max) {
				max = Xsum-Ysum;
			}
		}

		System.out.println(max);

		sc.close();
	}

}
