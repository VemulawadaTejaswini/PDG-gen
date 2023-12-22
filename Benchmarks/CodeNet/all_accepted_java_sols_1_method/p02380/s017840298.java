import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		double degree = Double.parseDouble(str[2]);

		double rad = Math.PI * (degree/180);
		double revrad = Math.PI * ( (180-degree)/180);

		double cx = b * Math.cos(revrad) + a;
		double cy = b * Math.sin(revrad);

		double cc = Math.pow(cx, 2) + Math.pow(cy, 2);

		System.out.printf("%.5f\n",a*b*Math.sin(rad) / 2);
		System.out.printf("%.5f\n",Math.sqrt(cc) + a + b);
		System.out.printf("%.5f\n",cy);
	}
}