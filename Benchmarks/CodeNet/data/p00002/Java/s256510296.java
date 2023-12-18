import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = "";

		try {
			while (null != (in = br.readLine())) {
				int a = Integer.parseInt((in.split(" ")[0]));
				int b = Integer.parseInt((in.split(" ")[1]));
				int fig = (int) (Math.floor(Math.log10(a + b))) + 1;
				System.out.println(fig);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}