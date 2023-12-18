import java.util.*;

 class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int x = (int)(Math.log(n)/Math.log(2));
	    System.out.println((long)(Math.pow(2,x+1)-1));
	}
}

