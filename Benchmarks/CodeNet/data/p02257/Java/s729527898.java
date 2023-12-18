import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static {
		createPrimeList();
	}
	static int[] primeList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] inputData = new int[n];
		for (int i = 0; i < n; i++) {
			inputData[i] = Integer.parseInt(br.readLine());
		}
		int primeCnt = 0;

		for (int target : inputData) {
			if (primeList[target] == 0) primeCnt++;
		}
		System.out.println(primeCnt);
	}

	public static void createPrimeList() {
		// ??????0 ??? ?´???°?????????1 ??? ????´???°
		primeList = new int[10001];
		primeList[0] = primeList[1] = 1;
		primeList[2] = 0;

		// Math.sqrt(1000) = 100
		// 88 *
		for (int i = 2; i < 100; i++) {
			for (int j = i; i * j <= 10000; j++) {
				primeList[i * j] = 1;
			}
		}
	}
}