import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		for (char c : line.toCharArray()) {
			if (Character.isLowerCase(c)) {
				System.out.print(Character.toUpperCase(c));
			} else {
				System.out.print(Character.toLowerCase(c));
			}
		}
		System.out.println();
	}

}