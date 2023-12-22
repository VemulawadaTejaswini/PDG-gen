import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] time = new int[N];
		for(int i = 0; i < N; i++) {
			time[i] = sc.nextInt();
		}

		int M = sc.nextInt();
		int[][] drink = new int[M][2];
		for(int i = 0 ; i < M; i++) {
			for(int l = 0 ; l < 2; l++) {
				drink[i][l] = sc.nextInt();
			}
		}

		int answer = 0;
		for(int i = 0 ; i < M; i++) {
			int p = drink[i][0]-1;
			for (int t= 0;t < time.length; t++) {
				if(p == t) {
					answer += drink[i][1];
				}else {
					answer += time[t];
				}
			}
			System.out.println(answer);
			answer = 0;
		}
	}
}