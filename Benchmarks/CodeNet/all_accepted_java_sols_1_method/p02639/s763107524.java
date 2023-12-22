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
		int i,n=5;
		for(i=1;i<=n; i++)
		{
		    int x = sc.nextInt();
		    if(x == 0)
		    {
		        System.out.println(i);
		        break;
		    }
		}
	}
}
