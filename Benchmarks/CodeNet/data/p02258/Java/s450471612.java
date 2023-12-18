import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int base = list.get(i);
			for (int j = i + 1; j < n; j++) {
				int current = list.get(j);

				if (max < current - base) {
					max = current - base;
				}
			}
		}
		System.out.println(max);
	}
}