/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.math.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long a=sc.nextLong();
	    double b=sc.nextDouble();
	    BigDecimal ans=new BigDecimal(a);
	    ans=ans.multiply(new BigDecimal(b));
	    //BigInteger an=new BigInteger(ans.doubleValue());
		System.out.println(ans.longValue());
	}
}
