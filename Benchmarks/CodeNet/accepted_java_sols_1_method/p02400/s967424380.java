import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		double r = Double.parseDouble(input);

		double s = r * r * Math.PI;
		double l = r * 2 * Math.PI;

//		System.out.printf("%.6f", "%.6f", s, l);

		String ansS = String.format("%.6f", s);
		String ansL = String.format("%.6f", l);

		System.out.println(ansS + " " + ansL);
	}
}