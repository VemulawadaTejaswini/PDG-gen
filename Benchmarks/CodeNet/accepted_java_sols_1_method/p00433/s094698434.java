import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sumA = 0, sumB = 0;
		
		for (int i = 0; i < 4; i++) {
			sumA += scanner.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			sumB += scanner.nextInt();
		}
		if (sumA < sumB) {
			System.out.println(sumB);
		} else {
			System.out.println(sumA);
		}
	}
}