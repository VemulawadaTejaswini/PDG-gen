import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int yakusu = 0;
		try {
			while ((buffer = reader.readLine())  != null) {
				Integer a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				Integer b = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				Integer c = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				for (int i = 1; i <= c; i++) {
					int sho = c / i;
					if (c == sho * i) {
						if (a <= i && i <= b) {
							yakusu++;
						}
					}
				}
				System.out.println(yakusu);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}