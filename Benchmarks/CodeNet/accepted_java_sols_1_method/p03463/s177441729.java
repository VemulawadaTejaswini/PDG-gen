import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] str = line.split(" ");
		int n = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);
		int b = Integer.parseInt(str[2]);
		if ((b - a) % 2 == 1) {
			System.out.println("Borys");
		} else {
			System.out.println("Alice");
		}
	}
}