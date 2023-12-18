import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] costArray = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		Arrays.sort(costArray);
		int ans = 0 + Math.abs(costArray[1] - costArray[0]) + Math.abs(costArray[2] - costArray[1]);
		System.out.println(ans);
		scanner.close();
	}
}