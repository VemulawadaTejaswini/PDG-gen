import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char str[] = br.readLine().toCharArray();

		long tmp = 0;
		long ans = 0;

		for (int i = 0; i < str.length - 1; ++i) {
			if (str[i] == 'A') {
				tmp++;
			} else if (str[i] == 'B' && str[i + 1] == 'C') {
				ans += tmp;
				i++;
			} else {
				tmp = 0;
			}
		}

		System.out.println(ans);
	}

}