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
		int n = sc.nextInt();
		int x = 0;
		while(true)
		{
		    if(n <= 1000)
		    {
		        x = 1000 - n;
		        break;
		    }
		    else
		    {
		        n = n - 1000;
		    }
		}
		System.out.println(x);
	}
}
