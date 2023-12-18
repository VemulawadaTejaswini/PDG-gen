import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputationCircle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
	    double r = Double.parseDouble(str);;
		System.out.printf("%6f %6f", r * r * Math.PI, r * 2 * Math.PI);
	}

}