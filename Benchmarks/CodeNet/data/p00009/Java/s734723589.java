import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> primeNumberList = getPrimeNumberList(1000000);

		try {
			while (input.ready()) {
				int num = Integer.valueOf(input.readLine());
				int primeNumberCount = 0;
				for (int j = 0; j < primeNumberList.size(); j++) {
					if (num >= primeNumberList.get(j)) {
						primeNumberCount++;
					} else {
						break;
					}
				}
				System.out.println(primeNumberCount);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Integer> getPrimeNumberList(int maxNumber) {
		int sqrtMaxnumber = (int) Math.sqrt(maxNumber);
		ArrayList<Integer> primeNumberList = new ArrayList<>();
		primeNumberList.add(2);

		for (int i = 3; i <= sqrtMaxnumber; i++) {
			boolean addFlag = true;
			for (int primeNumber : primeNumberList) {
				if (i % primeNumber == 0) {
					addFlag = false;
					break;
				}
			}
			if (addFlag) {
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}
}