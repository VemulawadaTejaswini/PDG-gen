import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //個数
		int total=in.nextInt(); //許容量
		int[] v = new int[n];//価値
		int[] w = new int[n];//重さ

		for (int i = 0; i < n; i++) {
			v[i] = in.nextInt();
			w[i] = in.nextInt();
		}

		int[][] t = new int[n][total + 1];
		//t[0][w[0]]= v[0];
		for (int i = 0; i < n; i++) {//品物１こずつループ

			for (int j = 1; j <=total; j++) {
				if(i==0) {
					if(j>=w[i]) {
						t[i][j]=v[i];
					}
				}else if(j<w[i]) {
					t[i][j]= t[i-1][j];
				}else {
					t[i][j]=Math.max(t[i-1][j], t[i-1][j-w[i]] +v[i]);
				}
				//System.out.printf("t[%d][%d]=%d\n",i,j,t[i][j]);
			}
		}

		System.out.println(t[n-1][total]);
		in.close();
	}
}



