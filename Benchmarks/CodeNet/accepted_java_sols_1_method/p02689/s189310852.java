import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int h[] = new int[n];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(str[i]);
		}

		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();

		for (int i = 0; i < n; i++)
			edge.add(new ArrayList<>());

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			edge.get(a).add(b);
			edge.get(b).add(a);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < edge.get(i).size(); j++) {
				int id = edge.get(i).get(j);
				if (h[i] <= h[id]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
