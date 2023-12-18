import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			int count = 0;
			int from = Integer.parseInt(list[0]);
			int to = Integer.parseInt(list[1]);
			int num = Integer.parseInt(list[2]);
			for (; from <= to; from++) {
				if (num % from == 0) {
					count++;
				}
			}
			System.out.println(count);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}