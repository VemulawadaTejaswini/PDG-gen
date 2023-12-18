import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int N = scan.nextInt();
		int[][] XY = new int[N][2];		//観光地
		int[] S = new int[2];		//スタート地点
		int cnt = 0;

		for(int i = 0; i < N; i++){
			int x = scan.nextInt();
			int y = scan.nextInt();
			XY[i][0] = x;
			XY[i][1] = y;
		}
		S[0] = XY[0][0];
		S[1] = XY[0][1];

		int i = 0;
		while(i < N){
			if((S[0] == XY[i][0]) && (S[1] == XY[i][1])){
				i++;
				continue;
			}else{
				if(S[0] < XY[i][0]){		//スタート地点より観光地が右側
					if(S[1] < XY[i][1]){		//スタート地点より観光地の方が右上
						S[0]++;
						S[1]++;
					}else{		//右側
						S[0]++;		//横右移動
					}
					cnt++;
				}
				if(S[0] > XY[i][0]){		//スタート地点より観光地の方が左側
					if(S[1] > XY[i][1]){		//スタート地点より観光地の方が左下
						S[0]--;
						S[1]--;
					}else{		//左側
						S[0]--;		//横左移動
					}
					cnt++;
				}
				if(S[0] == XY[i][0]){		//上下
					if(S[1] < XY[i][1]){		//上側
						S[1]++;
						cnt++;
					}else if(S[1] > XY[i][1]){		//下側
						S[1]--;
						cnt++;
					}if(S[1] == XY[i][1]){
						i++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}