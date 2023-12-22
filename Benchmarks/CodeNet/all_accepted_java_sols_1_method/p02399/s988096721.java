import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
		String str[], ans;
		int a, b;
		int d, r;
		String f;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);

        d = a / b;
        r = a % b;
        f = String.format("%.5f", ((double)a / (double)b));
        System.out.println(d + " " + r + " " + f);

	}

}