import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = (br.readLine().split(" "));
		double num1 = Integer.parseInt(nums[0]);
		double num2 = Integer.parseInt(nums[1]);

		System.out.println((int)Math.ceil(num1/(num2*2+1)));
	}
}
