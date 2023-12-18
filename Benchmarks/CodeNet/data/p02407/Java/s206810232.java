import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num1 = br.readLine();
		String num2 = br.readLine();

		String[] str = num2.split(" ");

		int result = Integer.parseInt(num1);
		int[] list = new int[result];

		for (int i = 0; i < result; i++) {

			list[i] = Integer.parseInt(str[i]);
		}
		for (int i = 0; i < result; i++) {
			for (int j = i + 1; j < result; j++) {
				if (list[i] < list[j]) {
					int tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
			System.out.print(list[i]);

			if (i == (result - 1)) {
				break;
			}
			System.out.print(" ");
		}
	}
}