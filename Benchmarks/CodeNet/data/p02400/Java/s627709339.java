import java.io.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double r = Double.parseDouble(str);
		double l = Math.PI * r * 2;
		double S = Math.PI * r * r;
		System.out.println(l + " " + S); 
	}
}