import java.util.*;
import java.io.*;

class Main
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(update(str));
	}
	static String update(String str)
	{
		char[] ch = str.toCharArray();
		for(int i = 0; i < 3; i++)
		{
			if(ch[i] == '1') ch[i] = '9';
			else ch[i] = '1';
		}
		return String.valueOf(ch);
	}

}