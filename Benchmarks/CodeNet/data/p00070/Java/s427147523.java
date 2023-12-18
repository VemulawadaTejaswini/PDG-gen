import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[][] c = new int[11][500];

	static boolean[] u = new boolean[10];

	static void perm(int n, int sum) {
		c[n][sum]++;
		if (n > 9)
			return;
		for (int i = 0; i < 10; i++) {
			if (u[i])
				continue;
			u[i] = true;
			perm(n + 1, sum + (n + 1) * i);
			u[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Arrays.fill(u, false);
		for (int i = 0; i < 11; i++)
			Arrays.fill(c[i], 0);
		perm(0, 0);
		String line;
		while ((line = bf.readLine()) != null) {
			String[] str = line.split(" ");
			if (str.length != 2)
				break;
			int n = Integer.parseInt(str[0]);
			int s = Integer.parseInt(str[1]);
			System.out.println(c[n][s]);
		}
	}
}