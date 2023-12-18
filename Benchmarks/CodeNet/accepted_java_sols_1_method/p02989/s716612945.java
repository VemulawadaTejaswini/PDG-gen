

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
			
		}
		Arrays.sort(ar);
		if(n%2==1)
		{
			System.out.println(0);
		}else {
			int div=(int) Math.ceil(n/2);
			System.out.println(ar[div]-ar[div-1]);
		}
	}
}
