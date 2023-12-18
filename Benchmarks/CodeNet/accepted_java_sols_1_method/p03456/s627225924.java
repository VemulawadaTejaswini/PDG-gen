import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int n = Integer.parseInt(a + b);
		
		for(int i = 1; i * i <= 10000000; ++i){
			if(i * i == n){
				System.out.println("Yes");
				break;
			}
			if(i * i > n){
				System.out.println("No");
				break;
			}
		}
	}
}