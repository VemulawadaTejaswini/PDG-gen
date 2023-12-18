import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main (String[] args) throws IOException, NumberFormatException{
			int a,b;
			int d,r;
			double f;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder builder = new StringBuilder();
			String data = br.readLine();
			String[] number = data.split(" ");
			a = Integer.parseInt(number[0]);
			b = Integer.parseInt(number[1]);
			d = a/b;
			r = a%b;
			f = (double)a/(double)b;

			builder
				.append(d)
				.append(" ")
				.append(r)
				.append(" ")
				.append(f)
				.append("\n");
			System.out.println(builder);
		}
}