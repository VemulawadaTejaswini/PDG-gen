import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] edge = new long[N];
		long con = 0;

		for (int i = 0; i < N; i++) {
			edge[i] = sc.nextLong();
		}

		if (N < 3) {
			System.out.println(0);
		}else {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < N; k++) {
						if (i == j || j == k || k == i) {
							continue;
						}else {
							if (edge[i] + edge[j] > edge[k] && edge[j] + edge[k] > edge[i] && edge[k] + edge[i] > edge[j] && edge[i] < edge[j] && edge[j] < edge[k]) {
								con++;
							}
						}
					}
				}
			}
			System.out.println(con);
		}


	}
}