import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] in = br.readLine().split(" ");
		for (;n != 0; n--) {
			System.out.print(in[n-1]);
			if (n == 1) break;
			System.out.print(" ");
		}
		System.out.println();
	}
}