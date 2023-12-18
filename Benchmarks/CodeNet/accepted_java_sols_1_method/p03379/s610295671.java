import java.util.Arrays;
import java.util.Scanner;



public class Main {
	public static void main(String[] args)  {
		// 入力
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] xList = new int[n];

		for (int i = 0; i < n; i++) {
			xList[i] = scanner.nextInt();
		}
		int[] copyList = xList.clone();
		Arrays.sort(xList);
		int point = (n+1)/2 -1;
		int targetA = xList[point];
		int targetB = xList[point + 1];
		
		for (int element : copyList) {
			if (element <= targetA) {
				System.out.println(targetB);
			} else {
				System.out.println(targetA);
			}
		}

	}
}