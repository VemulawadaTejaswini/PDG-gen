
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int primaryRange = Integer.valueOf(in.readLine());

		int result = 0;
		for (int index = 0; index < primaryRange; index++) {
			result += primaryNumber(Integer.valueOf(in.readLine()));
		}
		System.out.println(result);
	}

	public static int primaryNumber(int target) {

		int count = 0;
		boolean isPrime = true;
		int sqrt = (int)Math.sqrt(target);

		for (int i = 2; i <= sqrt; i++) {
			if (target % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			++count;
		}
		return count;
	}
}

