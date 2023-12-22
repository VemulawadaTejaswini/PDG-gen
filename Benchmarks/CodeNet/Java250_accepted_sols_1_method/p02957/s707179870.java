import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner blank = new Scanner(System.in);
		int a = blank.nextInt();
		int b = blank.nextInt();
		if((a + b) % 2 == 0){
		    System.out.println((a + b) / 2);
		}
		else{
		    System.out.println("IMPOSSIBLE");
		}
	}
}