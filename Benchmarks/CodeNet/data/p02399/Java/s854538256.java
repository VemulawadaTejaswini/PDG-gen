import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		//
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int[] inputInt = null;
		try {
			String[] inputStr = (input.readLine()).split(" ");
			inputInt = new int[inputStr.length];
			for (int i = 0; i < inputStr.length; i++) {
				inputInt[i] = Integer.parseInt(inputStr[i]);
			}
			int d = inputInt[0] / inputInt[1];
			int r = inputInt[0] % inputInt[1];
			double f = (double)(inputInt[0]) / inputInt[1];
			System.out.printf("%d %d %.5f",d,r,f);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

