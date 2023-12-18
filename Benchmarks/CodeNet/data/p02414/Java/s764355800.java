import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numN;
		int numM;
		int numL;

		double[][] boxA;
		double[][] boxB;
		double[][] boxAnser;

		String outPut = "";

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			//1???????????\???
			numN = sc.nextInt();
			numM = sc.nextInt();
			numL = sc.nextInt();

			boxA = new double[numN][numM];
			boxB = new double[numM][numL];
			boxAnser = new double[numN][numL];

			//???????????????

			//??????A?????????
			for (int i = 0; i < boxA.length; i++) {
				for (int j = 0; j < boxA[0].length; j++) {
					boxA[i][j] = sc.nextInt();
				}
			}
			//??????B?????????
			for (int i = 0; i < boxB.length; i++) {
				for (int j = 0; j < boxB[0].length; j++) {
					boxB[i][j] = sc.nextInt();
				}
			}
			//??????????£???§?¨????
			for (int i = 0; i < boxAnser.length; i++) {
				for (int j = 0; j < boxAnser[0].length; j++) {
					for (int k = 0; k < numM; k++) {

						boxAnser[i][j] += boxA[i][k] * boxB[k][j];
					}
				}
			}

			//???????????????
			for (int i = 0; i < boxAnser.length; i++) {
				for (int j = 0; j < boxAnser[0].length; j++) {
					if (!outPut.equals("")) {
						outPut += " ";
					}
					outPut += boxAnser[i][j];
				}
				System.out.println(outPut);
				outPut = "";
			}
		} finally {
			sc.close();
		}
	}

}