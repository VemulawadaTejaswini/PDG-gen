import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> d = new ArrayList<>();
		int answer = 1;

		for (int i = 0; i < N; i++) {
			d.add(sc.nextInt());
		}

		Collections.sort(d);

		for (int i = 0; i < N - 1; i++) {
			if (d.get(i) < d.get(i + 1)) answer++;
		}

		System.out.println(answer);
	}
}
