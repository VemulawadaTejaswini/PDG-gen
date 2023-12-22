import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = br.readLine().split(" ");
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);

        int d = a / b;
        int r = a % b;
        String f = String.format("%.5f", 1.0 * a / b);

        System.out.println(d + " " + r + " " + f);
	}
}