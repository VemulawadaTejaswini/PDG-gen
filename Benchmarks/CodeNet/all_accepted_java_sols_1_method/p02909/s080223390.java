import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		String str;
		switch (sysin.readLine()) {
		case "Sunny":
			str = "Cloudy";
			break;
		case "Cloudy":
			str = "Rainy";
			break;
		default:
			str = "Sunny";
			break;
		}
		System.out.println(str);
	}
}