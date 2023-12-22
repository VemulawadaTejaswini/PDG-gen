import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
			input = br.readLine();
		} catch (IOException e) {
		}
		String[] inputs = input.split(" ");
		for (int i = inputs.length - 1; i >= 0; i--) {
			System.out.print(inputs[i]);
			if (i != 0) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}
}
