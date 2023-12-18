import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static String ango;
	static ArrayList<String> kouho;
	static int kouhonum;
	
	static char[] buf;
	static char[] tmp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	private static void check(char[] text)
	{
		for(int j = 0;j < ango.length();j++) buf[j] = text[j];
		
		for(int i = 1;i < 26;i++)
		{
			for(int j = 0;j < ango.length();j++)
			{
				if(buf[j] == tmp[i])
				{
					buf[j] = tmp[i-1];
					break;
				}
			}
		}
		
		String making = String.valueOf(buf);
		if(ango.equals(making))
		{
			if(kouhonum >= 10)
			{
				kouho.set(5, kouho.get(6));
				kouho.set(6, kouho.get(7));
				kouho.set(7, kouho.get(8));
				kouho.set(8, kouho.get(9));
				kouho.set(9, String.valueOf(text));
			}
			else
			{
				kouho.add(String.valueOf(text));
			}
			kouhonum++;
		}
	}
	
	private static void dfs(char[] text, int num)
	{
		if(num == ango.length())
		{
			check(text);
		}
		else
		{
			char c = ango.charAt(num);
			
			text[num] = c;
			dfs(text, num+1);
			
			if(c != 'z')
			{
				text[num] = (char)((int)c + 1);
				dfs(text, num+1);
			}
		}
	}
	
	private static void start()
	{
		kouho = new ArrayList<String>();
		char[] text = new char[ango.length()];
		buf = new char[ango.length()];
		kouhonum = 0;
		dfs(text, 0);
		
		System.out.println(kouhonum);
		for(String s : kouho)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			ango = sca.next();
			
			if(ango.equals("#")) break;
			
			start();
		}
	}
}