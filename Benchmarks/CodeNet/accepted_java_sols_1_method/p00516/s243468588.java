import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//競技数
		int M = sc.nextInt();//委員の人数
		int A[] = new int[N];//費用
		int B[] = new int[M];//各委員の審査基準
		int Ap[] = new int[N];//人気競技への投票数
		int i,j;
		int result = 0;
		
		for(i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		for(j = 0; j < M; j++){
			B[j] = sc.nextInt();
		}
		
		for(j = 0; j < M; j++){
			for(i = 0; i < N; i++){
				if(A[i] <= B[j]){
					Ap[i]++;
					break;
				}
			}
		}
		
		int a = Ap[0];
		for(i = 1; i < N; i++){
			if(a < Ap[i]){
				a = Ap[i];
				result = i;
			}
		}
		System.out.println(result + 1);
	
	
	}
	

}