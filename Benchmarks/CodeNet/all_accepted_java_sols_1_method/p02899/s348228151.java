import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len =Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] ans = new int[len];
		
		for (int i = 0; i < len; i++) {
			ans[line[i] - 1] =i;
		}

		for (int i = 0;i < len;i++) {
			System.out.print(ans[i] + 1);
			if (i != len -1) {
				System.out.print(" ");
			}
		}
	}
}
