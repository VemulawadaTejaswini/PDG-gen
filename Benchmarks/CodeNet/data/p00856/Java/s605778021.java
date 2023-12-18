import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();
			final int T = sc.nextInt();
			final int L = sc.nextInt();
			final int B = sc.nextInt();
			
			if(N == 0 && T == 0 && L == 0 && B == 0){
				break;
			}
			
			boolean[] lose = new boolean[N+1];
			boolean[] back = new boolean[N+1];
			for(int i = 0; i < L; i++){
				lose[sc.nextInt()] = true;
			}
			for(int i = 0; i < B; i++){
				back[sc.nextInt()] = true;
			}
			
			double[][] DP = new double[T+1][N+1];
			DP[0][0] = 1;
			
			for(int turn = 0; turn < T; turn++){
				for(int pos = 0; pos < N; pos++){
					for(int dice = 1; dice <= 6; dice++){
						int next = pos + dice;
						if(next > N){
							next = 2 * N - next; 
						}
						
						if(back[next]){
							next = 0;
						}
						
						if(lose[next] && turn == T - 1){
							continue;
						}
						
						DP[turn + 1 + (lose[next] ? 1 : 0)][next] += DP[turn][pos] / 6;
					}
				}
			}
			/*
			for(int turn = 0; turn <= T; turn++){
				for(int pos = 0; pos <= N; pos++){
					System.out.print(DP[turn][pos] + ", ");
				}
				System.out.println();
			}
			*/
			double sum = 0;
			for(int turn = 0; turn <= T; turn++){
				sum += DP[turn][N];
			}
			
			System.out.println(sum);
		}
	}

}