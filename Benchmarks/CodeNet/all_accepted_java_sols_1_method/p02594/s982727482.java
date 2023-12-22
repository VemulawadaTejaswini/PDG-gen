import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int inputX = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		String result = (inputX >= 30) ? "Yes" : "No";
		System.out.println(result);
	}
}
