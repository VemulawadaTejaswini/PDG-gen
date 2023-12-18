
import java.util.Scanner;


public class Main {
	static int[][] d ;
	static int N;
	static int W;
	static int[][] item;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		W = Integer.parseInt(sc.next());
		//d[i][j] := i-1番目までの品物の中から重さがj以下になるように選んだときの価値の最大値
		//			 ※i=0のとき、一つも品物を選んでいない。
		d = new int[N+1][W+1];
		
		for(int i=0; i<N; i++){
			for(int j=0; j<W+1; j++){
				d[i][j] = 0;
			}
		}
		item = new int[N][2];
		for(int i=0; i<N; i++){
			item[i][0] = Integer.parseInt(sc.next());
			item[i][1] = Integer.parseInt(sc.next());
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<W+1; j++){
				if(i==0)d[i][j] = 0;
				if(item[i][1] > j){
					d[i+1][j] = d[i][j];
				}else{
					d[i+1][j] = Math.max(d[i][j], d[i][j-item[i][1]] + item[i][0]);
				}
			}
		}
		
		System.out.println(d[N][W]);
		
		sc.close();
	}

	
}

