import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1[] = br.readLine().split("");
		String str2[] = br.readLine().split("");

		int max = 0;
		for (int i = 0; i < str1.length - str2.length + 1; i++) {
			int count = 0;
			for (int j = 0; j < str2.length; j++) {
				if (str1[i + j].equals(str2[j])) {
					count++;
				}
			}
			max = Math.max(count, max);
		}

		System.out.println(str2.length - max);
	}

}