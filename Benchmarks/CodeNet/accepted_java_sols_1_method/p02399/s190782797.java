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
			String[] inputs = in.readLine().split(" ");
			long a = Long.parseLong(inputs[0]);
			long b = Long.parseLong(inputs[1]);
			long d = a / b;
			long r = a % b;
			double f = (double)a / (double)b;
			System.out.printf("%d %d %f\n", d, r, f);
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