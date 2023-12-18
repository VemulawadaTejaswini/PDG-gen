import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        double r = Double.parseDouble(str);

        double a = r * r * Math.PI;
        double c = 2 * r * Math.PI;

        System.out.println(a + " " + c);
	}
}