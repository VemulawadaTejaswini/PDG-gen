import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String n = sc.next();
		String[] xx = n.split("",0);
		int[] X = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			X[i] = Integer.parseInt(xx[i-1]);
		}
		//処理
		int[] ANS = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			//ビット反転
			if (X[i] == 1) {
				X[i] = 0;
			} else {
				X[i] = 1;
			}
			//10進数に直す
			int Xi = 0;
			int xn = 0;
			for (int j = 1; j <= N; j++) {
				if (X[j] == 1) {
					xn++;
					Xi += (int) Math.pow(2, N - j) * X[j];
				}
			}
			//求めた10進数を何度か割って答えを出す
			//Xi÷(2進数にしたときの1の個数)=〇…△
			//△÷(△を2進数にしたときの1の個数・・・
			//△が0になったらおわり
			int answer = 0;
			int a = Xi;
			while (xn > 0) {
				answer++;
				a = a % xn;
				Xi = Integer.parseInt(Integer.toBinaryString(a));
				int yn = 0;
				int Yi = Xi;
				while (Yi > 0) {
					if ((Yi % 10) == 1) {
						yn++;
					}
					Yi /= 10;
				}
				xn = yn;
			}
			ANS[i] = answer;
			//反転を戻す
			if (X[i] == 1) {
				X[i] = 0;
			} else {
				X[i] = 1;
			}
		}
		for (int k = 1; k <= N; k++) {
			System.out.println(ANS[k]);
		}

	}

}
