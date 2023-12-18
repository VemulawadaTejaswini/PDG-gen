import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		n = Integer.parseInt(sc.nextLine());

		String arys[] = sc.nextLine().split(" ");
		int[] ary = Stream.of(arys).mapToInt(Integer::parseInt).toArray();

		int count = 0;

		for (int i = 0; i < n; i++) {
			while (ary[i] % 2 == 0) {
				ary[i] /= 2;
				count++;
			}
		}
		System.out.println(count);

		sc.close();

	}
}
