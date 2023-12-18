import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int okashi = scanner.nextInt();

			List<Integer> integers = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				integers.add(scanner.nextInt());
			}

			Collections.sort(integers);
			int ans = 0;
			for (int i = 0; i < N; i++) {
				okashi -= integers.get(i);
				if (okashi < 0)
					break;
				if (okashi > 0 && i == N - 1)
					break;
				ans++;
			}
			System.out.println(ans);
		}
	}
}