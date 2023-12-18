import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	Scanner scanner = new Scanner(System.in);
		
	 String str = scanner.next();
	int a = Integer.parseInt(str);
	

    str = scanner.next();
    int b = Integer.parseInt(str);
    
    System.out.println((a*b) +" "+(a+b+a+b));
    
	}
}