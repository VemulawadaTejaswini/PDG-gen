    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
			}
			int max=Integer.MAX_VALUE;
			int temp=0;
			for(int i=1; i<=100; i++)
			{
				temp=0;
				for(int j=0; j<n; j++)
				{
					temp+=(i-a[j])*(i-a[j]);
				}
            max=Math.min(max,temp);
			}
			System.out.println(max);
		}
    }