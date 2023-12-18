import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine();
		System.out.printf("%.5f %.5f",(Double.parseDouble(strNum) * Double.parseDouble(strNum) * Math.PI), (2 * Double.parseDouble(strNum) * Math.PI));
	}

}