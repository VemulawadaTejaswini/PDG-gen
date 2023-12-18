import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
  		Scanner in = new Scanner(System.in);
		String R = in.next();
		double r = Double.parseDouble(R);

        double s,l;

		s = Math.PI * Math.pow(r,2);
        l = 2 * (Math.PI) * r;

        System.out.println(s + " " + l);
	}
}