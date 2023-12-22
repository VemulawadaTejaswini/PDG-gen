import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BufferedReader inMsg = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			while ((line = inMsg.readLine()) != null) {
				Integer a = Integer.parseInt(line);
				double pwrd = Math.pow(a, 3);
			    System.out.println(Math.round(pwrd));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}