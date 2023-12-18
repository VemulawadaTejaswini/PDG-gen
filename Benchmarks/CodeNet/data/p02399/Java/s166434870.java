import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

		String[] arrNbr = buffReader.readLine().split(" ");
		int a = Integer.parseInt(arrNbr[0]);
		int b = Integer.parseInt(arrNbr[1]);
		double f = (double)a / (double) b;
		int d = a / b;
		int r = a % b;

		System.out.println(d + " " + r  + " " + f);
	}
}