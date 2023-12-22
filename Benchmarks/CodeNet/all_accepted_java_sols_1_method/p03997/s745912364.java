import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int h = Integer.parseInt(br.readLine());
			int S = (a + b) * h / 2;
			System.out.println(S);
		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}
}
