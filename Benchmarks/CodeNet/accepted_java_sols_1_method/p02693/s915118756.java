import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int multiple = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String[] inputArray = input.split(" ");
		
		int start = Integer.parseInt(inputArray[0]);
		int end = Integer.parseInt(inputArray[1]);
		
		for (int i = start; i <= end; i++) {
			if (i % multiple == 0) {
				System.out.println("OK");
				System.exit(0);
			}
		}
		System.out.println("NG");
		System.exit(0);
	}
}