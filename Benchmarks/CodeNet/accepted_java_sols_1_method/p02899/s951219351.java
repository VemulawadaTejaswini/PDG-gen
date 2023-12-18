import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p;
		int[] a = new int[n];
		for(int i=0; i<a.length; i++)
		{
			p = sc.nextInt();
			a[p-1] = i+1;

		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}


	}
}