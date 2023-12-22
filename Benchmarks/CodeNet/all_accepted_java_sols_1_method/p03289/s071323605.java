
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sb =br.readLine();

		if(sb.charAt(0) != 'A') {
			System.out.println("WA");
			return;
		}

		if(sb.indexOf("C") > 1 && sb.indexOf("C") < sb.length()-1) {

		}else {
			System.out.println("WA");
			return;
		}



		sb = sb.replaceFirst("A", "");
		sb = sb.replaceFirst("C", "");


		if(sb.matches("[a-z]+")) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}

	}

}
