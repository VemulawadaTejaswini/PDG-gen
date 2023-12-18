import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] arg) throws IOException
	{
		double a,b,degree,rad,cx,cy,sq,len;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		a = Double.parseDouble(str[0]);
		b = Double.parseDouble(str[1]);
		degree = Double.parseDouble(str[2]);

		rad = Math.toRadians(degree);

		cx = b * Math.cos(rad) * (-1) + a;
		cy = b * Math.sin(rad);

		sq = (a*cy) / 2;
		len = Math.sqrt(cx*cx + cy*cy) + a + b;

		System.out.printf("%.5f %.5f %.5f\n",sq ,len ,cy);
	}
}