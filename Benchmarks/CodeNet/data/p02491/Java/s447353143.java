import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] nums = str.split(" ", 0);
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);

			BigDecimal aBD = new BigDecimal(a);
			BigDecimal bBD = new BigDecimal(b);

			int d = a /b;
			int r = a% b;
			BigDecimal f =aBD.divide(bBD, 5,  BigDecimal.ROUND_HALF_UP);

			System.out.println(d + " "+ r + " " + f);



		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}


	}
}