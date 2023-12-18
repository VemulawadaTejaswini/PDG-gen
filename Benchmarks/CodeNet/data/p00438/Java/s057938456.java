//AOJ0515

import java.util.Scanner;

public class Main {
	
	static int a, b, n;
	// (0, 0)
	static int[][] r = new int[16][16]; 
	static Scanner scan = new Scanner(System.in);		//入力
	
	public static void main(String[] args){
		while(read()){
			solve();
		}
	}


	public static boolean read()
	{
		
		a = scan.nextInt();
		b = scan.nextInt();
		// 余談だが, if文のブロックは正しくつけておいたほうがいいかも
		if(a==0 && b==0)
			return false;
		else{
			// 初期化を忘れている
			// このままだと, 前回の工事中のますが残ってしまう
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					r[i][j] = 0;
				}
			}
			
			int n = scan.nextInt();
			for(int i=0; i<n; i++){
				int c = scan.nextInt();
				int d = scan.nextInt();
				r[c-1][d-1] = 1; 		//工事中の交差点に１を代入しておく
			}
			return true;
		}
	}

	
	public static void solve(){
		for(int i=0; i<a; i++) {
			//１行と１列を１で初期化
			// 初期化の際工事中であるマスを考慮できてなかった
			if (r[i][0] == 1) {
				r[i][0] = 0;
			} else {
				r[i][0] = 1;
			}
		}
			
		for(int i=0; i<b; i++) {
			//１行と１列を１で初期化
			// 初期化の際工事中であるマスを考慮できてなかった
			if (r[0][i] == 1) {
				r[0][i] = 0;
			} else {
				r[0][i] = 1;
			}
		}
	
		
		for(int i=1; i<a; i++)
			for(int j=1; j<b; j++){
				if(r[i][j] == 1)		//値が１なら、問答無用で０に
					r[i][j] = 0;
				else		//値が０なら、要素r[i][j]は左と下の要素を加えたもの
					r[i][j] = r[i-1][j] + r[i][j-1];
			}
		System.out.println(r[a-1][b-1]);	//出力
		
	}
}