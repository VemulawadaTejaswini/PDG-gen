import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int d,r;
	double f;
		
	d = a / b;
	r = a % b;
	f = (double)a / b;
	
	BigDecimal x = new BigDecimal(f);
	x = x.setScale(6,BigDecimal.ROUND_HALF_UP);
	System.out.println(d+" "+r+" "+x);


    }
}