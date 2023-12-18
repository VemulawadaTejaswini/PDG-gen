import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		try {
			while ((line = br.readLine()) != null) {
				String[] v = line.split(" ");
				System.out.println(String.valueOf(Integer.parseInt(v[0]) + Integer.parseInt(v[1])).length());
			}
		} catch (Exception e) {
		}
	}
}