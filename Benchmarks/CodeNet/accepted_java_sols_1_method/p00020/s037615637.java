import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println((stdReader.readLine().toUpperCase()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}