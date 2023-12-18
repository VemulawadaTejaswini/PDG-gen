
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(line);

		int ans = 0;
		line[0] = line[2] - line[0];
		line[1] = line[2] - line[1];


		if (line[0] % 2 == 1 && line[1] % 2 == 1) {
			line[0]--;
			line[1]--;
			ans++;
		}else if ((line[0] % 2 == 1 && line[1] % 2 == 0)||(line[0] % 2 == 0 && line[1] % 2 == 1)) {
			if (line[0] % 2 == 1) {line[0]++;}
			if (line[1] % 2 == 1) {line[1]++;}
			ans++;
		}
		ans += (line[0] + line[1])/2;

		System.out.println(ans);

	}
}
