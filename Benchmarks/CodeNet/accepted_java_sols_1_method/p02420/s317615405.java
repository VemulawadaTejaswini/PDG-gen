import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuffer sb1 = null;
		StringBuffer sb2 = new StringBuffer();
		String cards;
		while (!(cards = input.readLine()).equals("-")) {
			sb1 = new StringBuffer(cards);
			int shuffle = Integer.parseInt(input.readLine());
			int i = 0;

			while (i != shuffle) {
				i++;
				int n = Integer.parseInt(input.readLine());
				String str = sb1.substring(0, n);
				sb1.delete(0, n);
				sb1.append(str);
			}
			sb2.append(sb1 + "\n");
		}
		System.out.print(sb2);

	}

}