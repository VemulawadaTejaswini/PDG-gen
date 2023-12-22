import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      String line;
	      while ((line = in.readLine()) != null) { 

			String[] ab = line.split(" ");

			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);

			 String out =Integer.toString(a+b);
			 System.out.println(out.length());
			
		}

	}
}