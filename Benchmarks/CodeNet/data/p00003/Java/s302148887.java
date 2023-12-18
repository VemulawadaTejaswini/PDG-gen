import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String read = null;
		ArrayList<String> output = new ArrayList<String>();

		int loop = Integer.parseInt(reader.readLine());

		while (loop > 0) {
			read = reader.readLine();
			String[] parts = read.split(" ");
			int[] nums = new int[3];
			int c = 0;
			for (String part:parts) {
				nums[c] = Integer.parseInt(part);
				c++;
			}

			if (Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(nums[2], 2)) {
				output.add("YES");
			} else {
				output.add("NO");
			}


			loop--;
		}

		System.out.println();
		for (String str:output) {
			System.out.println(str);
		}

	}

}