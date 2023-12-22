import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int ans = 0;
		for (int i = 0; i < len; i++) {
			if ((i + 1) % 2 == 1 && line[i] % 2 == 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}