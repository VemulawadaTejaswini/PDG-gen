import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int valueNum = Integer.parseInt(in.nextLine());
		int[] values = new int[valueNum];
		String[] tokens = in.nextLine().split(" ");
		for (int i = 0; i < valueNum; ++i) {
			values[i] = Integer.parseInt(tokens[i]);
		}
		int result = 0;
		while (true) {
			if (0L != Arrays.stream(values).filter(x -> x % 2 != 0).count()) {
				break;
			}
			result++;
			for (int i = 0; i < valueNum; ++i) {
				values[i] = values[i] / 2;
			}
		}
		System.out.println(result);
		in.close();
	}
}