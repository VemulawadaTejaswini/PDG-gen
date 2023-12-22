import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int maxNum = Integer.parseInt(br.readLine());

		boolean beforeIsOdd = false;
		int currentNum = 0;
		long pairCount = 0;

		for (int i = 1; i <= maxNum; i++) {
			currentNum = Integer.parseInt(br.readLine());
			pairCount += currentNum / 2;

			// 奇数のケース
			if (currentNum % 2 == 1) {
				if (beforeIsOdd) {
					pairCount++;
					beforeIsOdd = false;
				} else {
					beforeIsOdd = true;
				}
			} else {
				if (beforeIsOdd && currentNum != 0) {
					beforeIsOdd = true;
				} else {
					beforeIsOdd = false;
				}
			}
		}
		System.out.println(pairCount);
	}
}
