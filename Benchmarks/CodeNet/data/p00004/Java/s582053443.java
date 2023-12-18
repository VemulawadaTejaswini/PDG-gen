import java.util.Scanner;
import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
	Scanner cin = new Scanner(System.in);
	while(cin.hasNext())
	{
		double a = cin.nextInt();
		double b = cin.nextInt();
		double c = cin.nextInt();
		double d = cin.nextInt();
		double e = cin.nextInt();
		double f = cin.nextInt();
		BigDecimal xbd = new BigDecimal((c*e-b*f)/(a*e-b*d));
		BigDecimal ybd = new BigDecimal((a*f-c*d)/(a*e-b*d));
		BigDecimal x =  xbd.setScale(3, BigDecimal.ROUND_HALF_UP);
		BigDecimal y =  ybd.setScale(3, BigDecimal.ROUND_HALF_UP);
		System.out.println(x.doubleValue()+" "+y.doubleValue());
	}
    }
}