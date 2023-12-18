import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] A = new int[N];
		long[] score = new long[N-K+1];
		boolean[] ans = new boolean[N-K];
		
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		
		
		for(int i = 0; i < score.length; i++) {
			score[i] = 1;
		}
		
		int i = 0;
		int roop = N-K+1;
		//K -= 2;
		/*
		for(int j = 0; j < roop; j++) {
			K++;
			for(i = j; i < K; i++) {
				score[j] *= A[i];
				
			}
			score[j] *= A[i];
			
		}
		*/
		
		
		for(i = 0; i < K; i++) {
			score[0] *= A[i];
		}
		
		for(int j = 1; j < roop; j++) {
			score[j] = score[j-1] / A[j-1];
			score[j] *= A[K+j-1];
		}
		/*
		for(int a = 0; a < score.length;a++) {
			System.out.println(score[a]);
		}
		*/
		for(int h = 0; h < ans.length; h++) {
			
			if(h != (ans.length) && score[h] < score[h+1]) {
				ans[h] = true;
			}
		}
		
		for(int l = 0; l < ans.length; l++) {
			if(ans[l]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
	}

}
