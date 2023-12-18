import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String[] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);

		int d = a / b;
		int r = a % b;
		String f = String.format("%.5f", ((double)a / (double)b));

		System.out.println(d + " " + r + " " + f);
	}
}