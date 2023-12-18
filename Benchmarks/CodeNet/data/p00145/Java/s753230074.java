import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		List<Integer> u = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		long cost = 0;
		int n = Integer.parseInt(str);
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			String[] dataset = str.split(" ");
			u.add(Integer.parseInt(dataset[0]));
			d.add(Integer.parseInt(dataset[1]));
		}
		for (int j = 0; j < n - 1; j++) {
			int index = 0;
			long maxprod = 0;
			for (int i = 0; i < n - j - 1; i++) {
				long upper = u.get(i + 1);
				long lower = d.get(i);
				if (maxprod < upper * lower) {
					index = i;
					maxprod = upper * lower;
				}
			}
			cost += u.get(index) * d.get(index) * u.get(index + 1)
					* d.get(index + 1);
			u.remove(index + 1);
			d.remove(index);
		}
		System.out.println(cost);
	}
}