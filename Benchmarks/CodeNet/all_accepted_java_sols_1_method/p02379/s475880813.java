import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		double doubleX1 = scanner.nextDouble();
		double doubleY1 = scanner.nextDouble();
		double doubleX2 = scanner.nextDouble();
		double doubleY2 = scanner.nextDouble();
		double dbWidth = doubleX2 - doubleX1;
		double dbHeight = doubleY2 - doubleY1;

		double dbDistance = Math.sqrt(dbWidth * dbWidth + dbHeight * dbHeight);

		System.out.println(String.format("%.8f", dbDistance));
	}

}

