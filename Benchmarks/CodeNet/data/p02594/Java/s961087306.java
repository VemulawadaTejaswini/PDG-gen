import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temprature = Integer.valueOf(br.readLine());

		if(temprature >= 30) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
