import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] M = new int[2];
		int[] D = new int[2];
		for (int i = 0; i < 2; i++) {
			String[] str = reader.readLine().split(" ");
			M[i] = Integer.parseInt(str[0]);
			D[i] = Integer.parseInt(str[1]);
		}
		if (M[0] == M[1]) {
			System.out.println("0");
		}
		else {
			System.out.println("1");
		}
	}
}
