import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] numstr = str.split(" ", 5);
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(numstr[i]);
		}
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (num[i] < num[j]) {
					int temporary = num[i];
					num[i] = num[j];
					num[j] = temporary;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(num[i]);
			if (i != 4) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}
}