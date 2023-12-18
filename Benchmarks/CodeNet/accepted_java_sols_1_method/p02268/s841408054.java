import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] inputSequences = new int[stdIn.nextInt()];
		IntStream.range(0, inputSequences.length).forEach(i -> inputSequences[i] = stdIn.nextInt());

		int[] checkSequences = new int[stdIn.nextInt()];
		IntStream.range(0, checkSequences.length).forEach(i -> checkSequences[i] = stdIn.nextInt());

		int cnt = 0;
		for (int checkNum : checkSequences) {
			int searchIndex = Arrays.binarySearch(inputSequences, checkNum);

			if(searchIndex > 0) {
				cnt++;
			}
		}

		System.out.println(cnt);

		stdIn.close();
	}
}

