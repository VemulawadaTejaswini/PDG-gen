import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strAry = br.readLine().split(" ");
		double a = Double.parseDouble(strAry[0]);
		double b = Double.parseDouble(strAry[1]);
		double c = Double.parseDouble(strAry[2]);
		double d = Double.parseDouble(strAry[3]);
		System.out.println(Math.sqrt(Math.pow(c - a, 2) + Math.pow(d- b, 2)));
	}
}