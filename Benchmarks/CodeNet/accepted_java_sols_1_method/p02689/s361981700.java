import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int[] H = new int[N];
			int[] good_tenbodai = new int[N];
			int[][] AB = new int[M][2];

			for(int i = 0; i < N; i++) {
				H[i] = scn.nextInt();
			}

			for(int i = 0; i < M; i++) {
				AB[i][0] = scn.nextInt();
				AB[i][1] = scn.nextInt();
			}

			for(int i = 0; i < M; i++) {
				if(H[AB[i][0]-1] <= H[AB[i][1]-1]) {
					good_tenbodai[AB[i][0]-1] = 1;
				}
				if(H[AB[i][0]-1] >= H[AB[i][1]-1]) {
					good_tenbodai[AB[i][1]-1] = 1;
				}
			}

			int cnt = 0;
			for(int i = 0; i < N; i++) {
				if(good_tenbodai[i] == 0) cnt++;
			}

			System.out.println(cnt);
		}
	}
}