import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			while (str != null) {
				String[] split = str.split("\\s");
				Integer num = Integer.parseInt(split[0] + split[1]);
				System.out.println(String.valueOf(num).length());
				str = br.readLine();
			}
		} catch (Exception e) {
			System.exit(0);
		}
	}
}