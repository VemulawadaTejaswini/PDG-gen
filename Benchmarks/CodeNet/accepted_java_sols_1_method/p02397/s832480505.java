import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main
{
	public static void main(String[] args) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(
				new InputStreamReader(System.in)
				);
			while (true) {
				String[] inputs = in.readLine().split(" ");
				int a = Integer.parseInt(inputs[0]);
				int b = Integer.parseInt(inputs[1]);
				if ((a == 0) && (b == 0)) {
					break;
				}
				if (a < b) {
					System.out.printf("%d %d\n", a, b);
				} else {
					System.out.printf("%d %d\n", b, a);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	}
}