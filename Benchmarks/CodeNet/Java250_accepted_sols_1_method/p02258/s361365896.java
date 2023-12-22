import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		int min = 0;
		int prospectMin = 0;
		int beforeN = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			if (i == 0) {
				min = a;
				prospectMin = a;
				continue;
			}
			if (i == 1) {
				max = a;
				beforeN = a;
				if (a < min) {
					prospectMin = a;
				}
				continue;
			}
			if (beforeN <= a && max - min < a - prospectMin) {
				max = a;
				if (min > prospectMin) {
					min = prospectMin;
				}
			}
			if (a < prospectMin) {
				prospectMin = a;
			}
			beforeN = a;
		}
		System.out.println(max - min);
	}
}