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

		int[] t = new int[total + 1];

		for (int i = 0; i < n ; i++) {

			for (int j = w[i]; j <= total; j++) {

				t[j] = Math.max(t[j], t[j - w[i]] + v[i]);
				//System.out.printf("t[%d]=%d\n",j,t[j]);
			}
		}

		System.out.println(t[total]);
		in.close();
	}
}



