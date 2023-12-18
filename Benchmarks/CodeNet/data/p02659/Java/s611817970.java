/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double n = a * b;
		
		long x = (long) n;
		n = n * 1000;
		int i=3,p=0;
		while(i>0)
		{
		    int y = (int)n % 10;
		  //  System.out.println(y);
		    if(i == 3 && y < 5)
		    {
		        break;
		    }
		    else if(i == 2 && y < 9)
		    {
		        break;
		    }
		    else if(i == 1 && y == 9)
		    {
		        p = 1;
		        break;
		    }
		    i--;
		}
		if(p == 1)
		    x = x + 1;
		System.out.println(x);
	}
}
