import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力(NとMとC)
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int judge = C;
		int answer = 0;
		int [][] A = new int[N][M];
		int [] B = new int[M];
		for(int k=0;k<M;k++){
			B[k] = sc.nextInt();
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				judge = judge + A[i][j]*B[j];
			}
			if(judge > 0){
				answer++;
				}
			judge = C;
		}
		System.out.println(answer);
	}
}

