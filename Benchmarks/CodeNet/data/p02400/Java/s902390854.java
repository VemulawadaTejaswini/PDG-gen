import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

class Main{
public static void main(String[] args){

	Scanner s = new Scanner(System.in);
    int a=s.nextInt();	
    int b=s.nextInt();
   // double c= (double)a/(double)b;
      int c=a/b;
      int d =a%b;
   System.out.println(c+" "+d+" "+floatingDiv(a,b));
	}
	
	
	/*private static int div(int a,int b)
	{
	    
	    return a/b;
	}
		private static int siv(int a,int b)
	{
	    
	    return a%b;
	}*/
	private static BigDecimal floatingDiv(int a,int b){

	    BigDecimal num1 = new BigDecimal((double)a);
	    BigDecimal num2 = new BigDecimal((double)b);
	     return num1.divide(num2,MathContext.DECIMAL32);
	}

}
