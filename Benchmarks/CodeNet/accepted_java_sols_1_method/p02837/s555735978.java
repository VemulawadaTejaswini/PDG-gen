import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[][] x = new int[n][n];
		boolean[][] y = new boolean[n][n];


		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			for(int j = 0; j < a[i]; j++) {
				x[i][j] = scan.nextInt()-1;
				y[i][j] = (scan.nextInt() == 1);
			}
		}

		boolean[] yet = new boolean[n];		//既に言及されたかのフラグ
		boolean[] yesNo = new boolean[n];	//正直者かどうか．trueなら正直者
		boolean ctrd = false;					//矛盾が生じたらtrue

		int max = 0;					//正直者の最大人数


		for(int b = 1; b < 1<<n; b++) {
			yet = new boolean[n];
			yesNo = new boolean[n];
			ctrd = false;

			//正直者の数のカウントと正直者をyesNo=trueにする
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				if(((b >> i) & 1) == 1) {
					cnt++;
					yesNo[i] = true;
				}
			}

			//各証言を確かめる
			for(int i = 0; i < n; i++) {
				if(yesNo[i]) {	//正直者の証言のみ確認
					for(int j = 0; j < a[i]; j++) {
						if(y[i][j] != yesNo[x[i][j]]) {
							ctrd = true;
						}
					}
				}
			}

			if (!ctrd){
				if(cnt > max) {
					max = cnt;
				}
			}

		}


		System.out.println(max);


	}

}
