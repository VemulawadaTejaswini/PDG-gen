import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int xCnt = scan.nextInt();
		int yCnt = scan.nextInt();
		int xPoint = scan.nextInt();
		int yPoint = scan.nextInt();

		int[] xArray = new int[xCnt];
		for (int i = 0; i < xCnt; i++) {
			xArray[i] = scan.nextInt();
		}

		int[] yArray = new int[yCnt];
		for (int i = 0; i < yCnt; i++) {
			yArray[i] = scan.nextInt();
		}

		Arrays.sort(xArray);
		Arrays.sort(yArray);

		String result = null;
		if (xArray[xCnt-1] >= yArray[0]) {
			result = "War";
		} else {
			if (xArray[xCnt-1] > xPoint && yArray[0] <= yPoint) {
				result = "No War";
			} else {
				result = "War";
			}
		}
		System.out.println(result);
	}
}