import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int sum = 0;

		while ((line = br.readLine()) != null) {
			if (line.length() == 1) {
				sum++;
				continue;
			}
			int len, mid;
			len = line.length();
			mid = len / 2;
			for (int i = 0; i < mid; i++) {
				if (line.charAt(i) != line.charAt(len - 1 - i))
					break;
				if (i == mid - 1)
					sum++;
			}
		}
		System.out.println(sum);
	}
}