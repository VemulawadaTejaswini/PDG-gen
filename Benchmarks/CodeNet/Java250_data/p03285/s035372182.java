import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int CAKE = 4;
		final int DONUT = 7;

		while (sc.hasNext()) {
			int budget = sc.nextInt();
			boolean flag = false;

			for (int i=0; i*CAKE<=budget; i++) {
				for (int j=0; i*CAKE+j*DONUT<=budget; j++) {
					if (i*CAKE+j*DONUT == budget) {
						flag = true;
					}
				}
			}
			if (flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
