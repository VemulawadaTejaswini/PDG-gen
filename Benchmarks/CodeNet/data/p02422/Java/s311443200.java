import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String str = reader.readLine();
			String number = reader.readLine();
			int q = Integer.parseInt(number);

			String mth;
			String[] method;
			int a = 0;
			int b = 0;
			String reverse;
			for (int i = 0; i < q; i++) {
				mth = reader.readLine();
				method = mth.split(" ");
				a = Integer.parseInt(method[1]);
				b = Integer.parseInt(method[2]);
				if (method[0].equals("print")) {
					str = str.substring(a, b + 1);
					System.out.println(str);
				} else if (method[0].equals("reverse")) {
					reverse = new StringBuffer(str.substring(a, b + 1)).reverse().toString();
					str = new StringBuilder(str).replace(a, b, reverse).toString();
				} else {
					str = new StringBuilder(str).replace(a, b, method[3]).toString();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}