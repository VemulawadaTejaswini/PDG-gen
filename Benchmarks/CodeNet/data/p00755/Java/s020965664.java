import java.util.Scanner;

public class Main {

	int c;		// 最終色
	int h;
	int w;
	int max;		// 結合パネル数最大
	int tmp;		// 局地的結合パネル数算出保持
	boolean[][] comb;		// 結合パネル範囲(true)
	
	// pane[i][j]から移動できる同色パネル結合
	void Join(int[][] pane, int i, int j){
		// 配列外アクセスもしくは探索済みまたは同色でない
		if(i<0||i>=h||j<0||j>=w||comb[i][j]==true||pane[i][j]!=pane[0][0]){
			return;
		}
		tmp++;		// 局地的結合パネルインクリメント
		comb[i][j] = true;		// 探索済
		// 遷移先
		Join(pane,i+1,j);
		Join(pane,i,j+1);
		Join(pane,i-1,j);
		Join(pane,i,j-1);
	}
	
	void Color(int pane[][], int cnt){
		comb = new boolean[h][w];
		tmp = 0;
		Join(pane,0,0);		// 結合する
		max = Math.max(max,tmp);		// 最大値更新
		if(cnt==4){
			// 5回目彩色
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					if(comb[j][k]){
						pane[j][k] = c;
					}
				}
			}
			Color(pane,++cnt);	// 再帰
			return;
		}
		else if(cnt==5){
			return;
		}
		// 4回目以下
		cnt++;
		for(int i=1;i<=6;i++){		// 6色試す
			// 現在の階層の色と結合情報を退避させる
			int[][] copy = new int[h][w];
			boolean[][] copy_comb = new boolean[h][w];
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					copy[j][k] = pane[j][k];
					copy_comb[j][k] = comb[j][k];
				}
			}
			// i色に設定
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					if(comb[j][k]){
						pane[j][k] = i;
					}
				}
			}
			Color(pane,cnt);		// 再帰
			// 退避情報を次回の為に戻す
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					pane[j][k] = copy[j][k];
					comb[j][k] = copy_comb[j][k];
				}
			}
		}
	}

	void run(){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			h = stdIn.nextInt();
			w = stdIn.nextInt();
			c = stdIn.nextInt();
			if((h|w|c)==0){
				return;
			}
			int[][] pane = new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					pane[i][j] = stdIn.nextInt();
				}
			}
			max = 0;
			Color(pane,0);
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}