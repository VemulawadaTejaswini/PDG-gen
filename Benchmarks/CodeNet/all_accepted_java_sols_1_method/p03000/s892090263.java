import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>();
		int zahyo = 0;
		int answer = 0;

		for (int i = 1; i <= N; i++) {
			L.add(sc.nextInt());
		}

		for (int takasa : L) {
			zahyo += takasa;
			if (X < zahyo) break;
			answer++;
		}

		System.out.println(answer + 1);
	}
}
