import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] arg) throws IOException
	{
		double a,b,degree,rad,revrad,cc,cx,cy;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		a = Double.parseDouble(str[0]);
		b = Double.parseDouble(str[1]);
		degree = Double.parseDouble(str[2]);

		rad = Math.PI * (degree/180);
		revrad = Math.PI * ( (180-degree)/180);

		cx = b * Math.cos(revrad) + a;
		cy = b * Math.sin(revrad);

		cc = Math.pow(cx, 2) + Math.pow(cy, 2);

		System.out.printf("%.5f\n",a*b*Math.sin(rad) / 2);
		System.out.printf("%.5f\n",Math.sqrt(cc) + a + b);
		System.out.printf("%.5f\n",cy);
	}
}