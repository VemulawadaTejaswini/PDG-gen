import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = input.readLine();

			str = str.replace("peach", "temp");
			str = str.replace("apple", "peach");
			str = str.replace("temp", "apple");
			
			System.out.println(str);
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			System.out.println("halll");
		}

	}

}