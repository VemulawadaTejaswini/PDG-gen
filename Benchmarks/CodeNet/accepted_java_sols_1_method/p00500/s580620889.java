import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//プレイヤー人数
		int x[][] = new int[N][3];//二重配列　行にプレイヤー、列にゲーム数
		int p[][] = new int[N][3];//暫定ポイント
		int result[] = new int[N];//最終得点
		int i,j,k,a;
		
		for(i = 0; i < N; i++){
			for(j = 0; j < 3; j++){
				x[i][j] = sc.nextInt();//プレイヤーiの書いた数を入力
				p[i][j] = x[i][j];
			}
		}
		
		for(j = 0; j < 3; j++){
			for(i = 0; i < N; i++){//プレイヤーi
				for(k = i+1; k < N; k++){//プレイヤーiの比較対象プレイヤーk+1
					if(x[i][j] == x[k][j]){
						p[i][j] = 0;
						p[k][j] = 0;
						break;//両者のポイントを0にすれば、それ以降でiが増えていっても最初のプレイヤーと比較しなおす必要は無くなる。
					}
				}
			}
		}
		
		for(i = 0; i < N; i++){
			for(j = 0; j < 3; j++){
				result[i] = result[i] + p[i][j];
			}
		System.out.println(result[i]);
		}
	
	
	}	
	

}