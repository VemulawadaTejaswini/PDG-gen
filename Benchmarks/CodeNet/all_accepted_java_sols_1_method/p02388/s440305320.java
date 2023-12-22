import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String x;
			while ((x = br.readLine()) != null) {
				int input = Integer.parseInt(x);
				int output = input * input * input;
				System.out.println(output);
			}
		} catch (Exception ex) {
			System.exit(-1);
		}
	}
}