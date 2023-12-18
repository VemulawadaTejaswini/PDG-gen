import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int watch = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

		int h = watch / 3600;
		int m = watch / 3600 / 60;
		int s = watch % 60;

		System.out.println(h + ":" + m + ":" + s);
	}
}