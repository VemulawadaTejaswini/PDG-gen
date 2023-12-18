import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		
		int timesOfReplacement = bubbleSort(input);
		
		System.out.println(format(input));
		System.out.println(timesOfReplacement);
	}

	static int bubbleSort(int[] a) {
		boolean flag = true;
		int timesOfReplacement = 0;

		while (flag) {
			flag = false;
			for (int j = a.length - 1; 1 <= j; j--) {
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
					flag = true;
					timesOfReplacement++;
				}
			}
		}
		return timesOfReplacement;
	}

	static String format(int[] a) {
		return IntStream.of(a).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(" "));
	}
}