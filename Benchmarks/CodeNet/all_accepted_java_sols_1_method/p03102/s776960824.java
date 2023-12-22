import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		int[] listB = new int[M];
		int[][] listA = new int[N][M];
		
		for(int i = 0 ; i < M; i++) {
			listB[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < M; j++) {
				listA[i][j] = sc.nextInt();
			}
		}
		
		int res = 0;
		
		for(int sources = 0; sources < N; sources++) {
			int count = 0;
			for(int i = 0; i < M; i++) {
				count+=listA[sources][i]*listB[i];
			}
			if((count + C) > 0) {
				res++;
			}
		}
		System.out.println(res);
	}
}