import java.util.Scanner;
import java.math.BigDecimal;
class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double r= Double.parseDouble(reader.readLine());
		System.out.printf("%6f %6f",r*r*Math.PI,r*2*Math.PI);		
		
		
	}
}