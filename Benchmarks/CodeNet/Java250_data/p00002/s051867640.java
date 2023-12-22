import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		try {
			while ((str = br.readLine()) != null) {
				String[] num = str.split(" ");
				int a = Integer.parseInt(num[0]);
				int b = Integer.parseInt(num[1]);
				if (0 <= a && a <= 1000000 && 0 <= b && b <= 1000000) {
					System.out.println(Integer.toString(a + b).length());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}