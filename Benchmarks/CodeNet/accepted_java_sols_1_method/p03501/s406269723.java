import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			String[] inputs = input.split(" ");
			int n = Integer.parseInt(inputs[0]);
			int a = Integer.parseInt(inputs[1]);
			int b = Integer.parseInt(inputs[2]);
			System.out.println(Math.min(n*a, b));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
					br = null;
				}
			} catch (Exception e) {

			}
		}
	}
}
