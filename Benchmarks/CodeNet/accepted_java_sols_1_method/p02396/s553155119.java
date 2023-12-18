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
			int x;
			int i = 1;
			while (true) {
				x = Integer.parseInt(in.readLine());
				if (x == 0) {
					break;
				}
				System.out.printf("Case %d: %d\n", i, x);
				i++;
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