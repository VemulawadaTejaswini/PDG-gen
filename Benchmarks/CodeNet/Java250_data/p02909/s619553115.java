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
		String s1 = sc.nextLine();
		
		char x = s1.charAt(0);
		if(x == 'S')
		    System.out.println("Cloudy");
		else if(x == 'C')
		    System.out.println("Rainy");
		if(x == 'R')
		    System.out.println("Sunny");
	}
}
