import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			numbers.add(stdIn.nextInt());
		}
		stdIn.close();
		
		getCommonDivisors(numbers).stream().forEach(System.out::println);
	}

	private static List<Integer> getCommonDivisors(List<Integer> numbers) {
		List<Integer> commonDivisors = new ArrayList<>();
		int min = numbers.stream().min(Comparator.naturalOrder()).get();

		for(int i = 1; i <= min; i++) {
			if(isAllDivided(numbers,i)) {
				commonDivisors.add(i);
			}
		}
		
		return commonDivisors;
	}

	private static boolean isAllDivided(List<Integer> numbers, int divisor) {
		return numbers.stream().allMatch(n -> n % divisor == 0);
	}
}

