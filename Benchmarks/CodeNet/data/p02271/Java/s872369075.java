import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		List<Integer> numberList = IntStream.range(0, n).mapToObj(i -> stdIn.nextInt()).collect(Collectors.toList());

		int m = stdIn.nextInt();

		Set<Integer> allSumSet = getAllSumSet(numberList);

		for (int i = 0; i < m; i++) {
			String result = allSumSet.contains(stdIn.nextInt()) ? "yes":"no";
			System.out.println(result);
		}


		stdIn.close();
	}

	private static Set<Integer> getAllSumSet(List<Integer> inputNumberList) {
		Set<Integer> allPattern = new TreeSet<>();

		int allSize = (int)Math.pow(2, inputNumberList.size());
		int digits = inputNumberList.size();

		for (int i = 1; i < allSize; i++) {
			String boolStr = String.format("%"+digits+"s", Integer.toBinaryString(i)).replaceAll(" ", "0");

			allPattern.add(sum(inputNumberList, boolStr));
		}

		return allPattern;
	}

	private static int sum(List<Integer> numberList, String boolStr) {

		int sum = 0;

		for (int i = 0; i < boolStr.length(); i++) {
			if(boolStr.charAt(i) == '1') {
				sum += numberList.get(i);
			}
		}

		return sum;
	}
}

