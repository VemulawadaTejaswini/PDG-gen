import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String read = null;
		ArrayList<String> output = new ArrayList<String>();
		while ((read = reader.readLine()) != null) {
			String[] parts = read.split(" ");
			int[] nums = new int[2];
			int c = 0;
			for (String part:parts) {
				nums[c] = Integer.parseInt(part);
				c++;
			}

			int result = nums[0] + nums[1];

			String resultStr = String.valueOf(String.valueOf(result).length());
			output.add(resultStr);
		}

		for (String str:output) {
			System.out.println(str);
		}

	}

}