import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] in = br.readLine().split(" ");
			int x = Integer.parseInt(in[0]), y = Integer.parseInt(in[1]);
			if (x == 0 & y == 0) break;
			int min = x, max = y;
			if (x > y) {
				min = y;
				max = x;
			}
			System.out.println(min + " " + max);
		}
	}
}