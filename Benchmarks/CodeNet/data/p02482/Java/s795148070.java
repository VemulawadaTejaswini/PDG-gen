import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] in = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		System.out.println(solve(Integer.parseInt(in[0]), Integer.parseInt(in[1])));
	}
	
	public static String solve(int a, int b) {
		if (a < b) return "a < b";
		if (a > b) return "a > b";
		return "a == b";
	}
}