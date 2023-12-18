

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		long ans=(n*1L*(n-1))/2L;
		System.out.println(ans);
	}
}
