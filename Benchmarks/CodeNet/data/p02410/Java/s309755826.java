import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//データ入力数nとmをここで得る。
		int m =sc.nextInt();
		int n = sc.nextInt();
		//bとAの配列を作る
		int[]b = new int[100];
		int[][]A = new int[100][100];
		//答えを入れておくように箱作っておく
		int[]ans= new int[100];

		//配列Aの読み込み
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j] = sc.nextInt();
			}
		}

		//配列bの読み込み
		for(int j=0;j<m;j++) {
			b[j]=sc.nextInt();
		}
		//中身の計算
		for(int i = 0; i < n; i++) {
			ans[i]=0;
			for(int j = 0; j < m; j++){
				ans[i] += A[i][j]*b[j];
			}
		}
		//出力
		for (int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
	}
}



