import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		if((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			double tubo = 3.305785;
			double a = Double.parseDouble(sp[0]);
			double b = Double.parseDouble(sp[1]);

			System.out.println(a * b / tubo);


		}
	}
}