import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		double radi = a * a * 3.141592653589;
		double circ = (a + a)*3.141592653589;

		String radi2 = String.format("%.7f", radi);
		String circ2 = String.format("%.7f", circ);

		System.out.println(radi2 + " " + circ2);
	}
}

