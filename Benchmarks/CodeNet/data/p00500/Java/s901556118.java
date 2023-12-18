import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i, k;
		int[][] data = new int[N][3];
		int[] score = new int[N];
		for(i=0; i<N; i++){
			for(k=0; k<3; k++){
				data[i][k] = sc.nextInt();
			}
			score[i]=0;						//score[]を0で初期化。
		}
		for(k=0; k<3; k++){
			for(i=0; i<N; i++){
				if(check00(data, N, i, k) == 1){
					score[i] += data[i][k];
				}
			}
		}
		for(i=0; i<N; i++){
			System.out.println(score[i]);
		}

	}
	
	static int check00(int[][] data, int N, int r, int c){
		if(data[r][c] == 0){
			return 0;
		}
		int i;
		for(i=0; i<N; i++){
			if(i==r){
				continue;
			}
			else if(data[r][c] == data[i][c]){
				return 0;
			}
		}
		return 1;
	}

}