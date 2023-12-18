import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();

		@SuppressWarnings("unused")
		String temp = "";

		str = str.replaceAll("apple", "temp");
		str = str.replaceAll("peach", "apple");
		str = str.replaceAll("temp", "peach");

		System.out.println(str);
	}

}