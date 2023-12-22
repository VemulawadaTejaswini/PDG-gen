import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			int n = Integer.parseInt(input);

			int fx = 0;
			int num = n;
			while(true) {
				fx += num % 10;
				num /= 10;
				if(num <= 0)
					break;
			}

			if(n % fx == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

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
