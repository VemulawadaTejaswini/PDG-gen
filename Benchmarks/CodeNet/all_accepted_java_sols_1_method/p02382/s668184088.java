import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		// intXおよびintYの個数intNumの定義
		int intNum = scanner.nextInt();
		// 配列intx,intYの定義
		int intX[] = new int[intNum + 1];
		int intY[] = new int[intNum + 1];

		// 配列intXに2行目の数値を格納
		for (int intI = 0; intI < intNum; intI++) {
			intX[intI] = scanner.nextInt();
		}
		// 配列intYに2行目の数値を格納
		for (int intJ = 0; intJ < intNum; intJ++) {
			intY[intJ] = scanner.nextInt();
		}

		// pが1の時
		double dbMan = 0;
		for (int intA = 0; intA < intNum; intA++) {
			int intElement = intX[intA] - intY[intA];
			dbMan += (double)(Math.abs(intElement));
		}

		// pが2の時
		double dbEleSum = 0;
		double dbEuq;
		for (int intB = 0; intB < intNum; intB++) {
			int intElement = intX[intB] - intY[intB];
			int intEle2 = Math.abs(intElement);
			double dbEle3 = Math.pow(intEle2, 2);
			dbEleSum += dbEle3;
		}
		dbEuq = Math.sqrt(dbEleSum);

		// pが3の時
		double dbEleSum3 = 0;
		double dbCub;
		for (int intC = 0; intC < intNum; intC++) {
			int intElement = intX[intC] - intY[intC];
			int intEle2 = Math.abs(intElement);
			double Ele3 = Math.pow(intEle2, 3);
			dbEleSum3 += Ele3;
		}
		dbCub = Math.cbrt(dbEleSum3);

		//pが∞の時
		double dbChe = 0;
		double dbDis[] = new double[intNum + 1];
		// double dbMax = 0;
		for (int intd = 0; intd < intNum; intd++) {
			dbDis[intd] = (double)(intX[intd] - intY[intd]);
			double dbElement = Math.abs(dbDis[intd]);
			if (dbElement > dbChe) {
				dbChe = dbElement;
			}
		}


		System.out.println(String.format("%.6f", dbMan));
		System.out.println(String.format("%.6f", dbEuq));
		System.out.println(String.format("%.6f", dbCub));
		System.out.println(String.format("%.6f", dbChe));
	}

}

