import java.math.BigDecimal;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		System.out.println(find(num));
	}

	private static BigDecimal find(double num) 
	{
		// TODO Auto-generated method stub
		double d=num/3;
		BigDecimal b=BigDecimal.valueOf(d);
		BigDecimal c=b.multiply(b);
		b=c.multiply(b);
		
		return (b);
		
	}

}
