import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputN = scanner.nextInt();
		int inputD = scanner.nextInt();
		int inputX = scanner.nextInt();
		int[] inputAs = new int[inputN];
		for (int i = 0; i < inputN; i++) {
			inputAs[i] = scanner.nextInt();
		}
		scanner.close();

		int eatNum = 0;
		for (int inputA : inputAs) {
			int eatDay = 1;
			while (eatDay <= inputD) {
				eatNum++;
				eatDay += inputA;
			}
		}
		System.out.println(eatNum + inputX);

	}
}
