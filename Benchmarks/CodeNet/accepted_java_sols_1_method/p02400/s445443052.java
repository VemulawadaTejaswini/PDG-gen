import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x;
		double r, mennseki, ennsyuu;
		x = br.readLine();
		String[] ary = x.split(" ");
		r = Double.parseDouble(ary[0]);
		mennseki = r * r * Math.PI;
		ennsyuu = 2 * Math.PI * r;
		System.out.printf("%.6f", mennseki);
		System.out.print(" ");
		System.out.printf("%.6f", ennsyuu);
	}
}