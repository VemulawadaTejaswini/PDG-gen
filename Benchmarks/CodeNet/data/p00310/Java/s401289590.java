import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		while((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			int p = Integer.parseInt(sp[0]);
			int m = Integer.parseInt(sp[1]);
			int c = Integer.parseInt(sp[2]);

			System.out.println(p + m + c);
		}
	}

}