

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int D = Integer.parseInt(lines[1]);
		int[][] X = new int[N][D];
		int count = 0;

		for (int i = 0; i < N; i++) {
			line = sc.nextLine();
			lines = line.split(" ");
			for (int j = 0; j < D; j++) {
				X[i][j] = Integer.parseInt(lines[j]);
			}
		}


		for (int n = 0; n < N; n++) {
			for(int n2 = n+1; n2 < N; n2++) {
				double sum = 0;
				for (int i = 0; i < D; i++) {
					int diff = Math.abs(X[n][i] - X[n2][i]);
					sum += diff * diff;
				}

				if(isSquareNumber(sum)) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

    static // 平方数かどうかを調べる。
    boolean isSquareNumber (double number) {
        double sqrtOfNumber = Math.sqrt(number);
//    	System.out.println(sqrtOfNumber);
        return (isInteger(sqrtOfNumber));
    }

    static // 整数かどうかを調べる。
    boolean isInteger (double number) {
        return (number == Math.floor(number));
    }

}
