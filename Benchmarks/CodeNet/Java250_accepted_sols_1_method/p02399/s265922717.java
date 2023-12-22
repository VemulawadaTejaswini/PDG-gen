import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int a = 0;
		int b = 0;
		int d = 0;
		int r = 0;
		double f = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ");

		a = Integer.parseInt(num[0]);
		b = Integer.parseInt(num[1]);

		d = a / b;
		r = a % b;
		f = (double) a / (double) b;
		
		String g = String.format("%.5f" , f);

		System.out.print(d);
		System.out.print(" " + r);
		System.out.print(" " + g);
	}
}