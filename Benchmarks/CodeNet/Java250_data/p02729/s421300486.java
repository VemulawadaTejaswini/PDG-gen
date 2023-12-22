import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
		PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		solve(reader, writer);
		reader.close();
		writer.close();
	}

	private static void solve(BufferedReader reader, PrintWriter writer) throws IOException {
		String[] temp = (reader.readLine()).split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		int result = 0;
		if (n >= 2) {
			result += (n * (n - 1)) / 2;
		}
		if (m >= 2) {
			result += (m * (m - 1)) / 2;
		}
		writer.println(result);
	}
}
