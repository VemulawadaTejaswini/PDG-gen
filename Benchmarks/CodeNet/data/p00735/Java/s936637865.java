import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Main instance = new Main();
		instance.init(300000);
		read().stream().map(instance::execute).forEach(System.out::println);
	}

	private static List<Integer> read() {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int nextVal = sc.nextInt();
			if (nextVal == 1) {
				break;
			}
			list.add(nextVal);
		}
		sc.close();
		return list;
	}

	private List<Integer> mondaySaturdayList = new ArrayList<>();
	private List<Integer> mondaySaturdayPrimeList = new ArrayList<>();

	public void init(int maxValue) {
		int i;
		boolean isMonday;
		for (i = 1, isMonday = true; i < maxValue;) {
			if (isMonday) {
				i = i + 5;
				isMonday = false;
			} else {
				i = i + 2;
				isMonday = true;
			}
			mondaySaturdayList.add(i);
		}
		IntStream primeStream = mondaySaturdayList.stream().mapToInt(num -> num);
		for (int j : mondaySaturdayList) {
			if (j * j > maxValue) {
				break;
			}
			primeStream = primeStream.filter(num -> num <= j || num % j != 0);
		}
		mondaySaturdayPrimeList = primeStream.boxed().collect(Collectors.toList());
	}

	public String execute(int value) {
		StringBuilder sb = new StringBuilder(String.valueOf(value));
		sb.append(": ");
		sb.append(getPrimeFactors(value).stream().map(String::valueOf).collect(Collectors.joining(" ")));
		return sb.toString();
	}

	private List<Integer> getPrimeFactors(int value) {
		List<Integer> primeFactors = new ArrayList<>();
		for (Integer prime : mondaySaturdayPrimeList) {
			if (value > prime && value % prime == 0) {
				primeFactors.add(prime);
			}
		}
		if (primeFactors.isEmpty() && (value % 7 == 1 || value % 7 == 6)) {
			primeFactors.add(value);
		}
		return primeFactors;
	}
}