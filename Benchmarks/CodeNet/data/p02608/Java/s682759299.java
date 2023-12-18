import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int s[] = new int[1000000];

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					int num = i * i + j * j + k * k + i * j + j * k + k * i;
					s[num]++;
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(s[i]);
		}
	}
}