import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inp = br.readLine().split(" ");
		String input = null;
		int n = Integer.parseInt(inp[0]);
		int l = Integer.parseInt(inp[1]);
		String[] in = new String[n];
		for (int i = 0; i < n; i++) {
			in[i] = br.readLine();
		}
		Arrays.sort(in);
		for (int i = 0; i < n; i++) {
			System.out.print(in[i]);
		}
		System.out.println();
	}

}