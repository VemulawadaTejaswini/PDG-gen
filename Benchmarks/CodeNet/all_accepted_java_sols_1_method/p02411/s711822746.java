import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;

		try {
			while ((buffer = reader.readLine())  != null) {
				String[] strings = buffer.split(" ");

				int m = Integer.valueOf(strings[0]);
				int f = Integer.valueOf(strings[1]);
				int r = Integer.valueOf(strings[2]);

				if (m == -1 && f == -1 && r == -1) return;
				if (m == -1 || f == -1) {
					System.out.println("F");
				}
				else if (m + f >= 80) {
					System.out.println("A");
				}
				else if (m + f >= 65) {
					System.out.println("B");
				}
				else if (m + f >= 50) {
					System.out.println("C");
				}
				else if (m + f >= 30) {
					if (r >= 50) {
						System.out.println("C");
					}
					else {
						System.out.println("D");
					}
				}
				else {
					System.out.println("F");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

