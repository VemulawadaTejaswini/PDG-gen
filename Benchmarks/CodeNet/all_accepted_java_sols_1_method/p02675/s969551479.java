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
		int x = n % 10;
		if(x == 3)
		    System.out.println("bon");
		else if(x == 1 || x == 0 || x == 6 || x == 8)
		    System.out.println("pon");
		else
		    System.out.println("hon");
	}
}
