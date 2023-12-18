import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			int i;
			int num = Integer.parseInt(input);
			String ret = " ";
			for (i = 2; i <= num; i++) {
				if (i % 3 == 0 || i % 10 == 3) {
					ret = ret + i + " ";
				}
			}
			System.out.println(ret.substring(0, ret.length() - 1));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}