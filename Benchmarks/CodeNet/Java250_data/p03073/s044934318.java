import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		String s1[] = new String[str.length];
		String s2[] = new String[str.length];

		for (int i = 0; i < str.length; i++) {
			s1[i] = String.valueOf(i % 2);
			s2[i] = String.valueOf((i + 1) % 2);
		}

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals(s1[i])) {
				count1++;
			}
			if (!str[i].equals(s2[i])) {
				count2++;
			}
		}

		System.out.println(Math.min(count1, count2));
	}
}