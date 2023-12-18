import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[][] nums = new int[11][];
		nums[0] = new int[] { 0, 1, 1, 1, 1, 1, 1 };
		nums[1] = new int[] { 0, 0, 0, 0, 1, 1, 0 };
		nums[2] = new int[] { 1, 0, 1, 1, 0, 1, 1 };
		nums[3] = new int[] { 1, 0, 0, 1, 1, 1, 1 };
		nums[4] = new int[] { 1, 1, 0, 0, 1, 1, 0 };
		nums[5] = new int[] { 1, 1, 0, 1, 1, 0, 1 };
		nums[6] = new int[] { 1, 1, 1, 1, 1, 0, 1 };
		nums[7] = new int[] { 0, 1, 0, 0, 1, 1, 1 };
		nums[8] = new int[] { 1, 1, 1, 1, 1, 1, 1 };
		nums[9] = new int[] { 1, 1, 0, 1, 1, 1, 1 };
		nums[10] = new int[] { 0, 0, 0, 0, 0, 0, 0 };

		int curr = 10;
		while (!(line = br.readLine()).equals("-1") && !line.isEmpty()) {
			int next = Integer.parseInt(line);
			char[] sig = new char[7];

			for (int i = 0; i < 7; i++) {
				if (nums[curr][i] != nums[next][i]) {
					sig[i] = '1';
				} else {
					sig[i] = '0';
				}
			}
			curr = next;
			System.out.println(new String(sig));

		}

	}

}