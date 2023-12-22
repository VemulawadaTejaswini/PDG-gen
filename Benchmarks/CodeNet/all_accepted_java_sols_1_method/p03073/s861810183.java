

import java.util.Scanner;

public class Main {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	String g=scan.next();
	int start=0;
	long sum=0;
	for(int i=0;i<g.length();i++)
	{
		sum+=Math.abs((g.charAt(i)-'0')-start);
		start=1-start;
	}
	long sum2=0;
	start=1;
	for(int i=0;i<g.length();i++)
	{
		sum2+=Math.abs((g.charAt(i)-'0')-start);
		start=1-start;
	}
	System.out.println(Math.min(sum, sum2));
	
}
}
