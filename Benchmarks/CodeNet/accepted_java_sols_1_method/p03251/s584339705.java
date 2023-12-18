import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int X = Integer.parseInt(tokens[2]);
		int Y = Integer.parseInt(tokens[3]);
		List<Integer> x = new ArrayList<>(N);
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			x.add(Integer.parseInt(tokens[i]));
		}
		List<Integer> y = new ArrayList<>(M);
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < M; ++i) {
			y.add(Integer.parseInt(tokens[i]));
		}

		Collections.sort(x);
		Collections.sort(y);
		int xMax = Math.max(x.get(x.size() - 1), X);
		int yMin = Math.min(y.get(0), Y);
		if (yMin - xMax >= 1) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
		in.close();
	}
}