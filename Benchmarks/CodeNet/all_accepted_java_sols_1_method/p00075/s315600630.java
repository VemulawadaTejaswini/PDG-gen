import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		while((str=br.readLine())!=null){
			String[] sp = str.split(",");
			int s =Integer.parseInt(sp[0]);
			double w =Double.parseDouble(sp[1]);
			double h =Double.parseDouble(sp[2]);

			if(w / (h * h) >= 25){
				System.out.println(s);
			}
		}
	}
}