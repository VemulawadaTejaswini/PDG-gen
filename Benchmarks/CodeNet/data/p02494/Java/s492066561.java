import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] in = br.readLine().split(" ");
			int h = Integer.parseInt(in[0]), w = Integer.parseInt(in[1]);
			if (h == 0 & w == 0) break;
			StringBuilder sb = new StringBuilder();
			for (;h != 0; h--) {
				for (int i = w; i != 0; i--) sb.append('#');
				sb.append(System.getProperty("line.separator"));
			}
			System.out.println(sb);
		}
	}
}