import java.util.Arrays;
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
				
				// Main Algo
				int time = 0;
				int progress = 0;
				for(int j=0;j<r;j++){
					// 対象学生のレーコドだけ処理
					if(r_rec[j][2]!=hear[2]){
						continue;
					}
//					else{
//						System.out.println(r_rec[j][0]);
//					}
					// ログアウトは除外
					if(r_rec[j][3]==0){
						continue;
					}
					// 個々PCのログインとログアウトを関連づけて時間を算出
					int start = r_rec[j][0];
					int stop = 0;
					for(int k=j+1;k<r;k++){

						if((r_rec[k][2]==hear[2])&&(r_rec[j][1]==r_rec[k][1])){
//							System.out.println(r_rec[k][2]+" "+hear[2]+" "+r_rec[j][1]+" "+r_rec[k][1]+" "+r_rec[k][0]);
							stop = r_rec[k][0];
							break;
						}
					}
					if(progress>stop){
						continue;
					}
//					System.out.print(start+" "+stop+"/");
					if(start<hear[0]){
						start = hear[0];
					}
					if(start<progress){
						start = progress;
					}
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