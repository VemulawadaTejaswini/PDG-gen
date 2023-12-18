import java.util.*;
class Main 
{ 

	
	 
	public static void main(String args[]) 
	{ 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
		 	a[i] = s.nextInt();
		}	 

		int sum=0;
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			sum+=a[i];
		}

		System.out.println(sum>a[n-1]?"Yes":"No");
	}
} 
