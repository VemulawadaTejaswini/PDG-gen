import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] numArr = new int[N];

		for (int i = 0; i < N; i++) {
			numArr[i] = s.nextInt();
		}
		Arrays.sort(numArr);

		int idx = 0;
		int count = 0;
		while (idx < N-1) {
			if (numArr[idx] < numArr[idx + 1]) {
				count++;
			}
			idx++;
		}
		System.out.println(count+1);
	}
}
