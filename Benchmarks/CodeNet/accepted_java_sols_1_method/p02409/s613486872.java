import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][][] bfr =	new int[4][3][10]; //初期値は0?

		for(int z = 0; z < n; z++) {  //n回繰り返す
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			bfr[b-1][f-1][r-1] += v;    //b棟f階r番目の部屋にv人の入出
			}

		for(int k = 0; k < 4; k++) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 10; j++) {
					System.out.print(" " + bfr[k][i][j]);     //代入した数値を出力
				}
			System.out.println();
			}
			if(k < 3)
			System.out.println("####################");
		}
		sc.close();
	}
}

