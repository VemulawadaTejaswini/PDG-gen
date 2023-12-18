import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int taroscore = 0;
		int hanakoscore = 0;
		for (int i = 0; i < n; i++) {
			String[] str2 = br.readLine().split(" ");

			if (str2[0].compareTo(str2[1]) > 0) {
				taroscore += 3;
			} else if (str2[0].compareTo(str2[1]) < 0) {
				hanakoscore += 3;
			} else {
				taroscore += 1;
				hanakoscore += 1;
			}
		}
		System.out.println(taroscore + " " + hanakoscore);
	}
}