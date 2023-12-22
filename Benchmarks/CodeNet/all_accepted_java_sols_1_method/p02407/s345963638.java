import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");

		for (int i = n - 1; i >= 0; i--) {
			sb.append(str[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}

		System.out.println(sb);
	}
}