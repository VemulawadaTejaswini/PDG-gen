import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0 0")) {
			Set<List<String>> coordinate = new HashSet<>();
			String[] data1 = str.split(" ");
			int a = Integer.parseInt(data1[0]);
			int b = Integer.parseInt(data1[1]);
			int[][] route = new int[a][b];
			for (int i = 0; i < a; i++)
				for (int j = 0; j < b; j++)
					route[i][j] = 0;
			route[0][0] = 1;
			str = br.readLine();
			int n = Integer.parseInt(str);
			for (int i = 0; i < n; i++) {
				str = br.readLine();
				String[] data2 = str.split(" ");
				coordinate.add(Arrays.asList(data2));
			}
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					String[] ij = { i + 1 + "", j + 1 + "" };
					if (coordinate.contains(Arrays.asList(ij))) {
						route[i][j] = 0;
						continue;
					}
					if (i != a - 1)
						route[i + 1][j] += route[i][j];
					if (j != b - 1)
						route[i][j + 1] += route[i][j];
				}
			}
			System.out.println(route[a - 1][b - 1]);
			str = br.readLine();
		}
	}
}