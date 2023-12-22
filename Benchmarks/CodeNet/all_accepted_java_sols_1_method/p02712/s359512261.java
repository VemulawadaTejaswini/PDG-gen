
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		long sum = 0;
		
		for(int i=1;i<=n;i++){
		    if(i%3==0||i%5==0) continue;
		    else sum+=i;
		}
		
		System.out.println(sum);
	}
}
