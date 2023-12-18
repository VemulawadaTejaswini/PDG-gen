import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int kazu[] = new int[128];
		for (int i = 0; i < 128; i++)
		{
			kazu[i] = 0;
		}
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext())
		{
			sb.append(sc.nextLine());
		}
		String line = sb.toString();
		line = line.toLowerCase();
		for (int i = 0; i < line.length(); i++)
		{
			kazu[line.charAt(i)]++;
		}
		for (int i = 'a'; i <= 'z'; i++)
		{
			System.out.println((char)(i) + " : " + kazu[i]);
		}
		sc.close();
	}
}
