import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] inputStr = new String[Integer.parseInt(input.readLine())];
			inputStr = (input.readLine()).split(" ");
			int min = getMin(getIntArray(inputStr));
			int max = getMax(getIntArray(inputStr));
			long sum = getSum(getIntArray(inputStr));

			System.out.println(min + " " + max + " " + sum);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	public static int getMin(int[] inputInt) {
		int min = 1000000;

		for (int i = 0; i < inputInt.length; i++) {
		  if (min > inputInt[i]) {
		    min = inputInt[i];
		  }
		}
		return min;
	}

	public static int getMax(int[] inputInt) {
		int max = -1000000;

		for (int i = 0; i < inputInt.length; i++) {
		  if (max < inputInt[i]) {
			  max = inputInt[i];
		  }
		}
		return max;

	}

	public static long getSum(int[] inputInt) {
		long sum = 0;
		for (int i : inputInt) {
			sum += i;
		}
		return sum;
	}

	public static int[] getIntArray(String[] inputStr) {
		int[] inputInt = new int[inputStr.length];
		for (int i = 0; i < inputInt.length; i++) {
			inputInt[i] = Integer.parseInt(inputStr[i]);
		}
		return inputInt;
	}


}

