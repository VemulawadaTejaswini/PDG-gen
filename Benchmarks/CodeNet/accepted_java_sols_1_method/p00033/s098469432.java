import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int[] listLeft = new int[11];
			int[] listRight = new int[11];

			listLeft[0] = sc.nextInt();

			int leftNum = 0;
			int rightNum = 0;
			int yesFlag = 0;

			for (int j = 1; j < 10; j++) {
				int inputNum = sc.nextInt();

				if (inputNum < listLeft[leftNum]) {
					if (inputNum < listRight[rightNum]) {
						yesFlag = 1;
					} else {
						rightNum += 1;
						listRight[rightNum] = inputNum;
					}
				} else {
					leftNum += 1;
					listLeft[leftNum] = inputNum;
				}
				
			}
			if (yesFlag == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}

	}

}