import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		double degree = Double.parseDouble(str[2]);

		double rad = Math.toRadians(degree);

		double cx = b * Math.cos(rad) * (-1) + a;
		double cy = b * Math.sin(rad);

		double sq = (a*cy) / 2;
		double len = Math.sqrt(cx*cx + cy*cy) + a + b;

		System.out.printf("%.5f %.5f %.5f\n",sq ,len ,cy);
	}
}