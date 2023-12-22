import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			for(;;) {
				String integer = br.readLine();
				if (integer.equals("0")) {
					break;
				}
				System.out.println("Case " + caseNumber + ": " + integer);
				caseNumber++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int caseNumber = 1;

}
