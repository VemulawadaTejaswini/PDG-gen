import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			System.out.println(in.equals("a")? "vowel"
							  :in.equals("e")? "vowel"
    						  :in.equals("i")? "vowel"
							  :in.equals("o")? "vowel"
							  :in.equals("u")? "vowel"
							  :"consonant");

		}
	}
}
