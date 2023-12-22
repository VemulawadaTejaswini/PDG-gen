import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new java.util.Scanner(System.in);

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuilder sb = new StringBuilder();

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n==0) break;
			int[] s = new int[n];

			String[] dataset = br.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				s[i] = Integer.parseInt(dataset[i]);
			}
			int goukei = 0;

			for (int i : s) {
				goukei += i;
			}
			double m = (double)goukei / (double)n;

			double alfa2 = 0.0;

			for (int i : s) {
				alfa2 += (i - m) * (i - m);
			}

			alfa2 = alfa2 / n;

			double alfa = Math.sqrt(alfa2);
			System.out.println(alfa);
		}
	}

}