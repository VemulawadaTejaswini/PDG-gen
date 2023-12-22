import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		for (int i = 1; (x = Integer.parseInt(br.readLine())) != 0; i++) System.out.println("Case " + i + ": " + x);
	}
}