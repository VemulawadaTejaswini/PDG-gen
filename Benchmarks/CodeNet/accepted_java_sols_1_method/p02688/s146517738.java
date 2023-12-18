import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] sunuke =new int[line[0]];
		for (int i = 0; i < line[1]; i++) {
			sc.nextLine();
			int[] ret = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < ret.length; j++) {
				sunuke[ret[j] - 1]++;
			}
		}

		int ans =0;

		for (int i = 0; i < sunuke.length; i++) {
			if (sunuke[i] == 0) {
				ans++;
			}

		}

		System.out.println(ans);
	}
}