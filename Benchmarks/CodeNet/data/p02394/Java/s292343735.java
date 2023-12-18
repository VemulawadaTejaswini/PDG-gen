import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		String inStr;
		inStr = inp();
		String[] in;
		in = inStr.split(" ");

		int W = Integer.valueOf(in[0]);
		int H = Integer.valueOf(in[1]);
		int x = Integer.valueOf(in[2]);
		int y = Integer.valueOf(in[3]);
		int r = Integer.valueOf(in[4]);

		if (x >= r && y >= r && x + r <= W && y + r <= H)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static String inp() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}