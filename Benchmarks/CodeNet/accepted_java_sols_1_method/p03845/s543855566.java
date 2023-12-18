import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[]T = new int[N];
		
		
		
		for(int i = 0;i<N;i++){
			T[i] = scan.nextInt();	
		}
		
		
		
		int M = scan.nextInt();
		
		int[]P = new int [M];
		int[]X = new int [M];
		
		for(int i = 0;i<M;i++){
			P[i] = scan.nextInt();//M種類の中からi番目の物を飲んだらP[i]番の問題を解く
			X[i] = scan.nextInt();//P[i]番目の問題はX[i]秒かかる
		}
		
		
		
		int souwa = 0;
		
		
		for(int i = 0;i<M;i++){//M種類のドリンクごとの合計タイムを列挙
			
			
			for(int j = 0;j<N;j++){
				if(P[i]==j+1){//p[i]番目の問題をT[ｊ]びょうからX[i]秒にチェンジ
					souwa += X[i];
					
				}else{
					souwa += T[j];
				}
			}
			
			
			System.out.println(souwa);
			
			souwa=0;
		}
		
		
		
		
		
		
		
		
		
	}

}
