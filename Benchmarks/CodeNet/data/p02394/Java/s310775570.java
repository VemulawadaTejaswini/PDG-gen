import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
			br.close();
		} catch (IOException e) {
		}

		String[] inputs = input.split(" ");

		int w = Integer.parseInt(inputs[0]);
		int h = Integer.parseInt(inputs[1]);
		int x = Integer.parseInt(inputs[2]);
		int y = Integer.parseInt(inputs[3]);
		int r = Integer.parseInt(inputs[4]);

		if((x + r) <= w && (y + r) <= h && (x - r) >= 0 && (y - r) >= 0 ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
