import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			if ("0".equals(line))
				break;

			char[] nums = line.toCharArray();
			int sum = 0;
			for (char num : nums) {
				sum += num - '0';
			}
			System.out.println(sum);
		}
	}
}