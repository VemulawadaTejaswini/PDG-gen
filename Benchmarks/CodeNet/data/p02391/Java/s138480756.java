import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String buf = br.readLine();
			String[] list = buf.split(" ");
			int a = Integer.parseInt(list[0]);
			int b = Integer.parseInt(list[1]);
			if (a > b) {
				System.out.println("a > b");
			} else if (a < b) {
				System.out.println("a < b");
			} else {
				System.out.println("a == b");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}