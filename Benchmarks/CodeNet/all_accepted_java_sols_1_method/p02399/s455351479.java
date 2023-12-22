import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x;
		int a, b;
		double c;
		x = br.readLine();
		String[] ary = x.split(" ");
		a = Integer.parseInt(ary[0]);
		b = Integer.parseInt(ary[1]);
		
		
		System.out.print(a / b + " ");
		System.out.print(a % b + " ");
		c = (double)a / b;
		System.out.printf("%.5f", c);

	}
}