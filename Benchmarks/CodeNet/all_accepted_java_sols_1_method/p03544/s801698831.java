import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//リュカ数の配列を作成
		long L0 = 2;
		long L1 = 1;
		long L2;

		long[] numList = new long[86];

		numList[0] = L1;

		for (int i=1; i < 86; i++){
			L2 = L0 + L1;

			numList[i] = L2;

			L0 = L1;
			L1 = L2;
		}

		// 整数の入力
		int n = sc.nextInt();

		System.out.println(numList[n-1]);

		sc.close();
	}

}
