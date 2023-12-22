import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int i = 1;
		boolean b = true;
		while (b) {
			String str = br.readLine();
			if (str.equals("0")) {
				b = false;
			} else {
				System.out.println("Case " + i + ": " + str);
				i++;
			}
		}
	}
}