import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, Integer> primeNumberCountMap = new HashMap<>();
		ArrayList<Integer> primeNumberList = getPrimeNumberList(999999);

		for (int i = 1; i <= 999999; i++) {
			int primeNumberCount = 0;
			for (int j = 0; j < primeNumberList.size(); j++) {
				if (i >= primeNumberList.get(j)) {
					primeNumberCount++;
				} else {
					break;
				}
			}
			primeNumberCountMap.put(i, primeNumberCount);
		}

		try {
			while (input.ready()) {
				int num = Integer.valueOf(input.readLine());
				System.out.println(primeNumberCountMap.get(num).toString());
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