import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();

		double dnum = Double.parseDouble(num);

		String s = String.format("%.5f", dnum*dnum*Math.PI);
		String s2 = String.format("%.5f", dnum*2*Math.PI);

		System.out.println(s+" "+s2);



	}
}