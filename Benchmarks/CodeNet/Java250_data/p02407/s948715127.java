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
		for (int i = result - 1; i >= 0 ; i--){
			System.out.print(list[i]);

			if (i == 0) {
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}