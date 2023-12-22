import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			char[] c = br.readLine().toCharArray();
			Arrays.sort(c);
			String max = "", min = "";
			for (int j = 0; j < c.length; j++) {
				min += (c[j] + "");
				max += (c[c.length - j - 1] + "");
			}
			System.out.println(Integer.parseInt(max) - Integer.parseInt(min));
		}

	}

}