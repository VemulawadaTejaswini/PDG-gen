import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		// 行intRと列intCの入力
		int intR = scanner.nextInt();
		int intC = scanner.nextInt();

		int intNum[][] = new int [100 + 1][100 + 1];
		// 要素の入力
		for (int intI = 0; intI < intR; intI++) {
			for (int intJ = 0; intJ < intC; intJ++) {
				intNum[intI][intJ] = scanner.nextInt();
			}
		}

		int intSumR = 0;
		int intSumC = 0;
		int intSumAll = 0;
		for (int intK = 0; intK < intR; intK++) {
			for (int intL = 0; intL <= intC; intL++) {
				intSumR += intNum[intK][intL];
				if (!( intL == intC)) {
					System.out.print(intNum[intK][intL] + " ");
				} else if (intL == intC) {
					System.out.println(intSumR);
					intSumR = 0;
				}
			}
		}

		for (int intO = 0; intO <= intC; intO++) {
			for (int intP = 0; intP <= intR; intP++) {
				intSumC += intNum[intP][intO];
				intSumAll += intNum[intP][intO];
				if (intO == intC && intP == intR) {
				System.out.println(intSumAll);
				} else if (intP == intR - 1 && intO < intC) {
					System.out.print(intSumC + " ");
					intSumC = 0;
				}
			}
		}


	}

}
