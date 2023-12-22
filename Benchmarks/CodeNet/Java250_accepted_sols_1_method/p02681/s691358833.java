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
		String s = sc.nextLine();
		String t = sc.nextLine();
		int n = s.length();
		int m = t.length();
		int i,p=0;
		for(i=0; i<n; i++)
		{
		    if(s.charAt(i) != t.charAt(i))
		    {
		        p = 1;
		        break;
		    }
    	}
    	if(n+1 != m)
    	    p = 1;
    	if(p == 1)
    	    System.out.println("No");
    	else
    	    System.out.println("Yes");
}
}