import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Iterator<Integer> list = Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(Integer::valueOf)
				.sorted(Comparator.reverseOrder())
				.iterator();
		int result = 0;
		for (int flagNegate = 1; list.hasNext(); flagNegate *= -1) {
			result += list.next() * flagNegate;
		}
		System.out.println(result);
	}
}