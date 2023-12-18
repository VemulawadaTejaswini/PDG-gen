import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String inputString, phrase;
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferdReader = new BufferedReader(reader);
		
		inputString = bufferdReader.readLine();
		inputString = inputString + inputString;
		phrase = bufferdReader.readLine();
		if (inputString.indexOf(phrase) != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}