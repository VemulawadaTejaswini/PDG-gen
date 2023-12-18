import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;
		while(sc.hasNext())
		{
			String s = sc.next();
			if(s.equals("END_OF_TEXT"))
			{
				System.out.println(count);
				break;
			}
			if(word.compareToIgnoreCase(s) == 0)
			{
				++count;
			}
		}
	}
}