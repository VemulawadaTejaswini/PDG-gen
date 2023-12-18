import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] ts = new int[n+1];
		int[] xs = new int[n+1];
		int[] ys = new int[n+1];
		for (int i = 1; i <= n; i++) {
			String[] line = reader.readLine().split(" ");
			ts[i] = Integer.parseInt(line[0]);
			xs[i] = Integer.parseInt(line[1]);
			ys[i] = Integer.parseInt(line[2]);
		}
		for (int i = 1; i <= n; i++) {
			int dt = ts[i] - ts[i-1];
			int dx = Math.abs(xs[i] - xs[i-1]);
			int dy = Math.abs(ys[i] - ys[i-1]);
			int d = dx + dy;
			if (d > dt || d % 2 != dt % 2) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
