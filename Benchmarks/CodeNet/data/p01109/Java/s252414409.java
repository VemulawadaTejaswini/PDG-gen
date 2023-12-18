import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for ( ; ; ) {
			// 人数
			int personNum = Integer.parseInt(scanner.nextLine());
			
			if (personNum == 0) {
				break;
			}

			// 所得配列
			int[] incomeArray = new int [personNum];
			// 合計所得
			int totalIncome = 0;
			for (int i=0; i<personNum; i++) {
				incomeArray[i] = scanner.nextInt();
				totalIncome += incomeArray[i];
			}
			// 平均所得
			int averageIncome = totalIncome / personNum;
			// 平均以下人数
			int under = 0;
			// 平均以下判定
			for (int i=0; i<personNum; i++) {
				if (incomeArray[i] <= averageIncome) {
					under ++;
				}
			}
			System.out.println(under);
			// 次の行へ
			scanner.nextLine();
		}

	}

}

