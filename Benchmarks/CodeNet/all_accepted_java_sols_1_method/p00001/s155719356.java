import java.util.Arrays;
import java.util.Scanner;


public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] h = new int[10];
		for(int i=0;i<10;i++)
		{
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		for(int i=h.length-1;i>=7;i--)
		{
			System.out.println(h[i]);
		}
	}
}