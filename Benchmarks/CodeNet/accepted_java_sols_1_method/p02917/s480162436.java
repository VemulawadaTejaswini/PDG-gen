import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n-1];
		for(int i = 0; i < n-1; i++)
			a[i] = sc.nextLong();
		long an = a[n-2];
		for(int i = n-2; i > 0; i--)
		{
			an += Math.min(a[i], a[i-1]);
		}
		an += a[0];
		
		System.out.println(an);
	}

}
