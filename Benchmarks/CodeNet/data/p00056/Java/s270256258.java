import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	private static ArrayList<Integer> primeNumberList = getPrimeNumberList(50000);

	public static void main(String[] args) throws IOException {
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			while (input.ready()) {
				int dataset = Integer.valueOf(input.readLine());
				if (dataset == 0)
					break;
				int ans = getGoldbachs(dataset);
				System.out.println(ans);
			}
		}
	}

	private static int getGoldbachs(int number) {
		int ret = 0;
		for (int i = 0; i < primeNumberList.size(); i++) {
			if (primeNumberList.get(i) >= number)
				break;
			for (int j = i; j < primeNumberList.size(); j++) {
				if (primeNumberList.get(j) >= number)
					break;
				if ( primeNumberList.get(i) + primeNumberList.get(j) == number) {
					ret++;
				}
			}
		}
		return ret;
	}

	public static ArrayList<Integer> getPrimeNumberList(int maxNumber) {
		ArrayList<Integer> primeNumberList = new ArrayList<>();
		primeNumberList.add(2);
		primeNumberList.add(3);
		primeNumberList.add(5);
		primeNumberList.add(7);

		final int[] oneDigitList = { 1, 3, 7, 9 };

		int tmp;
		int sqrtTmp;
		boolean addFlag;
		for (int i = 10; i <= maxNumber; i += 10) {
			for (int oneDigit : oneDigitList) {
				addFlag = true;
				tmp = i + oneDigit;
				sqrtTmp = (int) Math.sqrt(tmp);
				for (int primeNumber : primeNumberList) {
					if (tmp % primeNumber == 0) {
						addFlag = false;
						break;
					}
					if (sqrtTmp < primeNumber) {
						break;
					}
				}
				if (addFlag) {
					primeNumberList.add(tmp);
				}
			}
		}
		return primeNumberList;
	}
}