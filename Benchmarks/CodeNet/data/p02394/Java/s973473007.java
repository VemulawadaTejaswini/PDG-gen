import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			int W = Integer.parseInt(list[0]);
			int H = Integer.parseInt(list[1]);
			int x = Integer.parseInt(list[2]);
			int y = Integer.parseInt(list[3]);
			int r = Integer.parseInt(list[4]);


			if (W >= x + r && H >= y + r) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}