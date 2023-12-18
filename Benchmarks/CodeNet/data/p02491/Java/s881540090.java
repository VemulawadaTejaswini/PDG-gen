import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int a = Integer.parseInt(line.split(" ")[0]);
		int b = Integer.parseInt(line.split(" ")[1]);
		System.out.printf("%d %d %.5f", a/b, a%b, (double)a/b);
	}
}