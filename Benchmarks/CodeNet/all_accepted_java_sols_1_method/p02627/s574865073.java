import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c = br.readLine().charAt(0);
		if(Character.isUpperCase(c))
			System.out.println("A");
		else
			System.out.println("a");
	}
}