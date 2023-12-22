import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String c = br.readLine();
			if(c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
				System.out.println("vowel");
			}else {
				System.out.println("consonant");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}