import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int status [][] = new int [4][2];
		int before [][] = new int [4][2];
		int N = in.nextInt();
		int K = in.nextInt();
		int pasta[] = new int [N + 1];
		for(int i = 1; i <= 3; i++){
			for(int k = 0; k <= 1; k++){
				status[i][k] = 0;
				before[i][k] = 0;
			}
		}
		for(int i = 0; i < K; i++){
			pasta[in.nextInt()] = in.nextInt();
		}
		for(int i = 1; i <= N; i++){
			if(pasta[i] != 0){//予約ありの時
				//System.out.println(i+"日目予約あり");
				if(i == 1){//初回に予約有りの時
					status[pasta[i]][0] = 1;
				}
				else{//初回以外に予約有りの時
					for(int k = 1; k <= 3; k++){
						for(int m = 0; m <= 1; m++){
							status[pasta[i]][0] += before[k][m];//予約パスタ（本日１日目状態）に前日の状態すべてを加算
						}
					}
					status[pasta[i]][1] += before[pasta[i]][0];//予約パスタ（本日の２日目状態）に（前日の１日目状態）を加算
					status[pasta[i]][0] -= before[pasta[i]][0];//予約パスタ（本日の１日目状態）から同種パスタの（前日の１日目状態）を減算
					status[pasta[i]][0] -= before[pasta[i]][1];//予約パスタ（本日の１日目状態）から同種パスタの（前日の２日目状態）を減算
					//System.out.println(i+"日 1日目状態の種類"+pasta[i]+"が"+status[pasta[i]][0]);
					//System.out.println(i+"日 2日目状態の種類"+pasta[i]+"が"+status[pasta[i]][1]);
				}
			}
			else{//予約無しの時
				if(i == 1){//初回予約なしの時
					for(int k = 1; k <= 3; k++){
						status[k][0] = 1;//すべての（本日の１日目状態）に１を代入
					}
				}
				else{//初回以外の予約なしの時
					//まずは（当日の１日目状態）に関して
					for(int k = 1; k <= 3; k++){//（当日のパスタ）のfor文
						for(int n = 1; n <= 3; n++){//（前日のパスタ）のfor文
							for(int m = 0; m <= 1; m++){//（何日目か）のfor文
								status[k][0] += before[n][m];//（本日の１日目状態）にすべての（前日の状態）を加算
							}
						}
						status[k][0] -= before[k][0] + before[k][1];//（本日の一日目状態）から同種パスタの（前日の１日目状態）と（前日の２日目状態）を減算
						//System.out.println("種類"+k+"の１日目状態　"+status[k][0]);
					}
					//（当日の１日目状態）終わり
					//次に（当日の２日目状態）に関して
					for(int k = 1; k <= 3; k++){
						status[k][1] = before[k][0];//（本日の２日目状態）に同種パスタの（前日の１日目状態）を代入
						//System.out.println("種類"+k+"の2日目状態　"+status[k][1]);
					}
					//（当日の２日目状態）終わり
				}
				//初回以外予約なし終わり
			}
			//予約なしもありも終わり
			//すべての（本日の状態）を（前日の状態）に変更
			for(int k = 1; k <= 3; k++){
				for(int m = 0; m <= 1; m++){
					before[k][m] = status[k][m] % 10000;
					status[k][m] = 0;
				}
			}
			//変更完了
		}
		//N回のループ完了
		int sum = 0;
		for(int k = 1; k <= 3; k++){
			for(int m = 0; m <= 1; m++){
				sum += before[k][m];
			}
		}
		System.out.println(sum % 10000);
	}

}