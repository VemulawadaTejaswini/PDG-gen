import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numbers[] = br.readLine().split(" ");
		int x = Integer.parseInt(numbers[0]);
		int a = Integer.parseInt(numbers[1]);
		if (x >= a) {
			System.out.println(10);
		} else
			System.out.println(0);
	}

}