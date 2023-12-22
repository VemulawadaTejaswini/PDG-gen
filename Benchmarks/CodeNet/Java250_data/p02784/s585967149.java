import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[k];
		long sum = 0;
	    for(int i=0;i<k;i++)
	    {
	    	a[i] = sc.nextInt();
	    	sum = sum + a[i];
	    }
	    if(sum>=n)
	    {
	    	System.out.println("Yes");
	    }
	    else
	    {
	    	System.out.println("No");
	    }
	}
}