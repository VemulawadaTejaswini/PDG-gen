import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, r;
	static int[] p, c;
	
	static int[] cut(int[] cards, int pp, int cc)
	{
		int[] ret = new int[n];
		
		int i;
		for(i = 0;i < cc;i++) ret[i] = cards[i + pp - 1];
		for(i = 0;i < pp-1;i++) ret[i+cc] = cards[i];
		for(i = pp+cc-1;i < n;i++) ret[i] = cards[i];
		
		return ret;
		
	}
	
	static void start()
	{
		int[] cards = new int[n];
		for(int i=0;i < n;i++)
		{
			cards[i] = n-i;
		}
		
		for(int i=0;i < r;i++)
		{
			cards = cut(cards, p[i], c[i]);
		}
		
		System.out.println(cards[0]);
	}
	
	public static void main(String[] args)
	{
		
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			r = sca.nextInt();
			if(n == 0) break;
			
			p = new int[r];
			c = new int[r];
			for(int i=0;i < r;i++)
			{
				p[i] = sca.nextInt();
				c[i] = sca.nextInt();
			}
			
			start();
		}
	}
}