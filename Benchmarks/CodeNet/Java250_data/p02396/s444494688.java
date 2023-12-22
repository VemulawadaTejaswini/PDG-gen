import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			int num, i = 1;
			do {
				num = Integer.parseInt(br.readLine());
				if (num == 0) {
					break;
				} else {
					System.out.println("Case " + i + ": " + num);
					i++;
				}
			} while (true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}