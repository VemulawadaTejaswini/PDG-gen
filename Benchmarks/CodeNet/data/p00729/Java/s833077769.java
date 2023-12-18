import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n==0&&m==0){
				return;
			}
			int r = stdIn.nextInt();
			int[][] r_rec = new int[r][4];
			for(int i=0;i<r;i++){
				for(int j=0;j<4;j++){
					r_rec[i][j] = stdIn.nextInt();
				}
			}
			int q = stdIn.nextInt();
			for(int i=0;i<q;i++){
				int[] hear = new int[3];		// hear = question
				for(int j=0;j<3;j++){
					hear[j] = stdIn.nextInt();
				}
				
				
				int time = 0;
				int progress = 0;
				// 一つずつレコード走査
				for(int j=0;j<r;j++){
					// 対象学生のレーコドだけ処理
					if(r_rec[j][2]!=hear[2]){
						continue;
					}
					// ログアウトはスタート時刻として除外
					if(r_rec[j][3]==0){
						continue;
					}
					// 個々PCのログインとログアウトを関連づけて時間を算出
					int start = r_rec[j][0];
					int stop = 0;
					for(int k=j+1;k<r;k++){
						// 対象学生の一致確認と同PCのログインログアウト関連付け確認
						if((r_rec[k][2]==hear[2])&&(r_rec[j][1]==r_rec[k][1])){
							stop = r_rec[k][0];
							break;
						}
					}
					// 計算進捗時間が今回の終了時間より大きければ除外
					if(progress>stop){
						continue;
					}
					// 今回の終了時間が範囲のスタート時間より下回ってるのは除外
					if(stop<hear[0]){
						continue;
					}
					// 範囲外のスタート時刻を範囲内に収める
					if(start<hear[0]){
						start = hear[0];
					}
					// 計算進捗時間までは重複するので削る
					if(start<progress){
						start = progress;
					}
					// 範囲外のストップ時刻を範囲に収める
					if(stop>hear[1]){
						stop = hear[1];
					}
//					System.out.println(start+" "+stop);
					time += stop-start;
					progress = stop;
				}
				System.out.println(time);
			}
		}
	}
}