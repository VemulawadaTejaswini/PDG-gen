import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String text;
			int num, i = 1;
			do {
				text = br.readLine();
				num = Integer.parseInt(text);
				if (num == 0) {
					break;
				} else {
					System.out.println("Case " + i + ": " + num);
				}
			} while (true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}