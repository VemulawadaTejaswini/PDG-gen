import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			if (line.length() > 1) {

				char[] nums = new char[10];
				int n, min, max;
				String minstr = "", maxstr = "";

				for (int i = 0; i < 8; i++) {
					n = Integer.parseInt(String.valueOf(line.charAt(i)));
					nums[n]++;
				}

				for (int i = 9; i >= 0; i--) {
					if (nums[i] > 0) {
						for (int j = 1; j <= nums[i]; j++) {
							maxstr += String.valueOf(i);
						}
					}
				}
				for (int i = 7; i >= 0; i--) {
					minstr += String.valueOf(maxstr.charAt(i));
				}
				max = Integer.valueOf(maxstr);
				min = Integer.valueOf(minstr);
				System.out.println(max - min);
			}

		}
	}
}