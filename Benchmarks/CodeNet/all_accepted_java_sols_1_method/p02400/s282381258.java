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
			double r = Double.parseDouble(in.readLine());
			System.out.printf("%f %f\n", 
				Math.PI * r * r,
				2.0 * Math.PI * r
			);
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