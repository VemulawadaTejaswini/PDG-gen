import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		String str = scan.next();
		if(k>=str.length()) {
			System.out.println(str);
		}
		else 
		{
			System.out.println(str.substring(0,k)+"...");
		}
	}
}
