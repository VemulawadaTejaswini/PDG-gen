//Print Test Cases
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int count =1;
		while (!(input = in.readLine()).equals("0")){
			System.out.println("Case "+count+": "+input);
			count++;
		}
	}
}