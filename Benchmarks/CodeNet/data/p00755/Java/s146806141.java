import java.util.Arrays;
import java.util.Scanner;

public class Main {

	int c;		// finish color
	int h;
	int w;
	int max;
	int tmp;
	boolean[][] comb;
	int z = 0;
	
	void Join(int[][] pane, int i, int j){
		if(i<0||i>=h||j<0||j>=w||comb[i][j]==true||pane[i][j]!=pane[0][0]){
			return;
		}
		tmp++;
		comb[i][j] = true;
		Join(pane,i+1,j);
		Join(pane,i,j+1);
		Join(pane,i-1,j);
		Join(pane,i,j-1);
	}
	
	void Color(int pane[][], int cnt){
		// 結合する
		comb = new boolean[h][w];
		tmp = 0;
//		if(z++>20){
//			System.exit(0);
//		}
		Join(pane,0,0);
//		System.out.println("結合状態");
//		for(int i=0;i<h;i++){
//			System.out.println(Arrays.toString(comb[i]));
//		}
		max = Math.max(max,tmp);
//		System.out.println("最大値"+max);
		if(cnt==4){
//			System.out.println("5回目 "+c+"に彩色");
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					if(comb[j][k]){
						pane[j][k] = c;
					}
				}
			}
//			System.out.println("設定色");
//			for(int j=0;j<h;j++){
//				System.out.println(Arrays.toString(pane[j]));
//			}
			Color(pane,++cnt);
			return;
		}
		else if(cnt==5){
			return;
		}
		cnt++;
		for(int i=1;i<=6;i++){
//			System.out.println(cnt+"回目 "+i+"に彩色");
			int[][] copy = new int[h][w];
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					copy[j][k] = pane[j][k];
				}
			}
			boolean[][] copy_comb = new boolean[h][w];
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					copy_comb[j][k] = comb[j][k];
				}
			}
			for(int j=0;j<h;j++){
				for(int k=0;k<w;k++){
					if(comb[j][k]){
						pane[j][k] = i;
					}
				}
			}
//			System.out.println("設定色");
//			for(int j=0;j<h;j++){
//				System.out.println(Arrays.toString(pane[j]));
//			}
			Color(pane,cnt);
//			System.out.println("戻し");
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