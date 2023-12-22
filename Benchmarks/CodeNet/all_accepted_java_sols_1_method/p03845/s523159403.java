import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//変数//
		int N;		//問題数
		int M;		//ドリンクの種類
		
		int[] T;	//各問題にかかる時間
		int[] P;	//各ドリンクの効果が発生する問題位置
		int[] X;	//上記の効果後の問題にかかる時間
		int[] ans;	//出力結果
		
		Scanner scan = new Scanner(System.in);
		//入力//
		N = scan.nextInt();
		
		T = new int[N];
		for(int i = 0; i < N; i++){
			T[i] = scan.nextInt();
		}
		
		M = scan.nextInt();
		
		P = new int[M];
		X = new int[M];
		for(int i = 0; i < M; i++){
			P[i] = scan.nextInt();
			X[i] = scan.nextInt();
		}
		
		scan.close();
		//処理//
		
		//結果用配列の初期化
		ans = new int[M];
		for(int i = 0; i < M; i++){
			ans[i] = 0;
		}
		
		//各ドリンクを使用した場合の合計を計算する
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				if( P[i] == j + 1 ){
					ans[i] += X[i];
				}else{
					ans[i] += T[j];
				}
			}
		}
		
		//結果//
		for(int i = 0; i < M; i++){
			System.out.println(ans[i]);
		}

	}

}
