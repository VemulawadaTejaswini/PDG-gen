
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		long[] As = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		Arrays.sort(As);
		if(As[0] == 0) {
			System.out.println(0);
			return;
		}
		long result = 1L;
		long threshold = (long)Math.pow(10, 18);
		for(int i = As.length - 1; i >= 0; i--) {
			if(threshold / As[i] < result ) {
				System.out.println(-1);
				return;
			}
			result *= As[i];
		}
		System.out.println(result);
	}
}
