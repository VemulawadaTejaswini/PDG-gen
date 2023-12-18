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

		int max = 0;
		int min = 0;
		int sum = an[n-1];
		for (int i = 0; i < (n - 1); i++) {
			max = Math.max(an[i], an[i + 1]);
			min = Math.min(an[i], an[i + 1]);
			sum += an[i];
		}

		System.out.println(min + " " + max + " " + sum);
	}

}