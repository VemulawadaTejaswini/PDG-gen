import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		double x = Math.pow(Integer.parseInt(in), 3);
		System.out.println((int)x);
		br.close();
	}
}