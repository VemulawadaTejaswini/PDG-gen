import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String list[] = br.readLine().split(" ");
			int x = Integer.parseInt(list[0]);
			int y = Integer.parseInt(list[1]);
			System.out.println(x * y + " " + ((x * 2) + (y * 2)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}