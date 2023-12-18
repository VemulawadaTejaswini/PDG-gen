import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int taisyoInt = Integer.parseInt(line);
		int baisu = taisyoInt / 3;

		for(int i = 1; i <= baisu; i++){
			System.out.print(" " + 3 * i);
		}

	}

}