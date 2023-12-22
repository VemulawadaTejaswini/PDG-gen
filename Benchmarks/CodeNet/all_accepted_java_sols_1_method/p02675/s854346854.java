import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()) % 10;

		switch (n) {
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			System.out.println("hon");
			break;
		case 0:
		case 1:
		case 6:
		case 8:
			System.out.println("pon");
			break;
		case 3:
			System.out.println("bon");
			break;
		}
	}
}
