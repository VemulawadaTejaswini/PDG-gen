import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			String[] text = br.readLine().split(" ");
			int i;
			String ret = "";
			for (i = text.length - 1; i >= 0; i--) {
				if (i == text.length - 1) {
					ret = text[i];
				} else {
					ret = ret + " " + text[i];
				}
			}
			System.out.println(ret);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}