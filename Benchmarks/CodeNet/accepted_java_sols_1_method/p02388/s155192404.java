import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int x = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
		System.out.println((x * x * x));
	}
}