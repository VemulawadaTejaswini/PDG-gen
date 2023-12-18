import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] num = line.split(" ");
		int n = Integer.parseInt(num[0]);
		int a = Integer.parseInt(num[1]);
		int b = Integer.parseInt(num[2]);
		int t = n * a;

		if (t > b) {
			System.out.println(b);
		} else {
			System.out.println(t);
		}
	}
}
