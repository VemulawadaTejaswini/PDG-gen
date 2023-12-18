import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		double p;
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		double c = Double.parseDouble(str[2]);
		System.out.println(a*b/2);
		p =Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println(a+b+p);
		System.out.println(b);
	}
}