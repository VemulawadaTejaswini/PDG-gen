import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		int[] highs = new int[10];

		try {
			for (int i = 0; i <= 9; i++) {
				highs[i] = Integer.parseInt(br.readLine());
			}

			for (int i = 0; i <= 9; i++) {
				list.add(highs[i]);
			}

			Collections.sort(list);
			Collections.reverse(list);

			for (int i = 0; i <= 2; i++) {
				System.out.println(list.get(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}