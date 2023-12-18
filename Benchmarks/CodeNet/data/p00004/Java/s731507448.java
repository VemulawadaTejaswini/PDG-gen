import java.io.*;

public class Main {
	public static void main(String[] argv) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] lineArray;
		while ((line = br.readLine()) != null) {
			lineArray = line.split(" ");
			int[] f = new int[lineArray.length];
			for (int i = 0; i < lineArray.length; i++) {
				f[i] = Integer.parseInt(lineArray[i]);
			}
			double x = (f[4] * f[2] - f[1] * f[5]) / (f[0] * f[4] - f[1] * f[3]);
			double y = (-f[2] * f[3] + f[0] * f[5]) / (f[0] * f[4] - f[1] * f[3]);

			System.out.print(String.format("%.3f %.3f", x, y) + "\n");
		}
	}
}