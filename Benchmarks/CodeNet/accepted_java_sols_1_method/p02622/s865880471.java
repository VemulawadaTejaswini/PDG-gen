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
		int x = 0;
		String s = sc.nextLine();
		String t = sc.nextLine();
		 
		int n = t.length();
		int i;
		for(i=0; i<n; i++)
		{
		    if(s.charAt(i) != t.charAt(i))
		        x++;
		}
		System.out.println(x);
	}
}
