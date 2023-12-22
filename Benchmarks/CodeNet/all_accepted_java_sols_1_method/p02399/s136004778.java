import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			int a = Integer.parseInt(list[0]);
			int b = Integer.parseInt(list[1]);
			int d = a / b;
			int r = a % b;
			double f = (double) a / b;
			System.out.println(d + " " + r + " " + String.format("%.5f", f));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}