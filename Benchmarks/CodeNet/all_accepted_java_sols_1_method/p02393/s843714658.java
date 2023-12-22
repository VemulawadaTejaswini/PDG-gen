import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				Integer a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ")));
				Integer b = Integer.valueOf(buffer.substring(buffer.indexOf(" ") + 1, buffer.indexOf(" ", buffer.indexOf(" ") + 1)));
				Integer c = Integer.valueOf(buffer.substring(buffer.indexOf(" ", buffer.indexOf(" ") + 1) + 1));
				if (a < b) {
					if (b < c) {
						System.out.println(a + " " + b +" " + c);
					}
					else {
						if (a < c) {
							System.out.println(a + " " + c + " " + b);
						}
						else {
							System.out.println(c + " " + a + " " + b);
						}
					}
				}
				else {
					if (a < c) {
						System.out.println(b + " " + a + " " + c);
					}
					else {
						if (b < c) {
							System.out.println(b + " " + c + " " + a);
						}
						else {
							System.out.println(c + " " + b + " " + a);
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}