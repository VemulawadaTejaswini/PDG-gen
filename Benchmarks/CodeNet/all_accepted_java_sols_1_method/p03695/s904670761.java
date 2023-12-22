import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int rate[] = new int[9];
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);

			if (a < 400) {
				rate[0]++;
			} else if (a < 800) {
				rate[1]++;
			} else if (a < 1200) {
				rate[2]++;
			} else if (a < 1600) {
				rate[3]++;
			} else if (a < 2000) {
				rate[4]++;
			} else if (a < 2400) {
				rate[5]++;
			} else if (a < 2800) {
				rate[6]++;
			} else if (a < 3200) {
				rate[7]++;
			} else {
				rate[8]++;
			}
		}

		int count = 0;
		for (int i = 0; i < 8; i++) {
			if (rate[i] != 0) {
				count++;
			}
		}

		int max = 0;
		int min = 0;
		if (rate[8] != 0) {
			max = count + rate[8];
			min = (count == 0) ? 1 : count;
		} else {
			max = count;
			min = count;
		}

		System.out.println(min + " " + max);
	}
}
