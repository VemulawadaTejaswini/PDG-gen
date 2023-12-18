import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//競技数
		int M = sc.nextInt();//委員の人数
		int A[] = new int[N+1];//費用Ai
		int B[] = new int[M+1];//各委員の審査基準Bj
		int C[] = new int[M+1];//Bのコピー
		int Ap[] = new int[N+1];//競技iへの投票数
		int i,j;
		
		for(i = 1; i < N+1; i++){
			A[i] = sc.nextInt();
		}
		
		for(j = 1; j < M+1; j++){
			B[j] = sc.nextInt();
			C[j] = B[j];
		}
		
		for(i = 1; i < N+1; i++){
			for(j = 1; j < M+1; j++){
				if(A[i] <= B[j]){
					Ap[i]++;
					B[j] = 0;
				}
			}
		}
		
		for(j = 0; j < M+1; j++){
			B[j] = C[j];
		}
		
		int ApMAX = Ap[1];
		for(i = 2; i < N+1; i++){//Apの大きさを比べて一番のものを出力
			if(Ap[i] > ApMAX){
				ApMAX = Ap[i];
			}
		}
	
		System.out.println(ApMAX);
	
	
	}
	

}