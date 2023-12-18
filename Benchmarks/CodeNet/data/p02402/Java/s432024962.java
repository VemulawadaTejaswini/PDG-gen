import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] an = new int[n];

		for (int i = 0; i < n; i++) {
			an[i] = Integer.parseInt(str[i]);
		}

		int max = an[0];
		int min = an[0];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (max < an[i]) {
				max = an[i];
			}
			if (min > an[i]) {
				min = an[i];
			}
			sum += an[i];
		}

		System.out.println(min + " " + max + " " + sum);
	}

}