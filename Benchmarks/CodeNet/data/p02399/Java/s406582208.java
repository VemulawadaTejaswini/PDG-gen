import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws IOException {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.toString();
		String[] nums = line.split(",", 0);
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		int d = a / b;
		int r = a % b;
		double f = a / b;

				System.out.println(d + " " + r + " " + f);

	}

}