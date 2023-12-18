import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> inputList = new ArrayList<>();

		try {
			while (input.ready()) {
				inputList.add(Integer.valueOf(input.readLine()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int each : inputList) {
			System.out.println(getFactorial(each));
		}
	}

	public static long getFactorial(int num) {
		long ans = 1;
		for (int i = num; i > 1; i--) {
			ans *= i;
		}
		return ans;
	}
}