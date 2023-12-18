import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Integer> card = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for (int i = 1; i <= 2 * n; i++) {
			card.add(i);
		}
		str = br.readLine();
		int m = Integer.parseInt(str);
		for (int i = 0; i < m; i++) {
			str = br.readLine();
			int command = Integer.parseInt(str);
			if (command == 0)
				Riffle(n);
			else
				Cut(command, n);
		}
		for (int num : card) {
			System.out.println(num);
		}
	}

	private static void Riffle(int n) {
		for (int i = 0; i < n; i++) {
			card.add(card.get(i));
			card.add(card.get(i + n));
		}
		card.subList(0, 2 * n).clear();
	}

	private static void Cut(int k, int n) {
		for (int i = k; i < 2 * n; i++)
			card.add(card.get(i));
		for (int i = 0; i < k; i++)
			card.add(card.get(i));
		card.subList(0, 2 * n).clear();
	}
}