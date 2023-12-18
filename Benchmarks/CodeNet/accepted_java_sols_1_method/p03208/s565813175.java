import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	

    static String[] map =new String[1005];
    static int [] dx={1,0,-1,0};
    static int [] dy={0,1,0,-1};

	public static void main(String args[])throws IOException  {

		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int m=in.nextInt();
		long [] a=new long[n];
		
		long ans=0;
		long maxx=1000000000;
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextLong();
			
		}
		Arrays.sort(a);
		for(int i=0;i<=n-m;i++)
		{
			long t=a[i+m-1]-a[i];
			maxx=Math.min(t,maxx);
		}
		
		System.out.println(maxx);
//		while(in.hasNext())
//		{
//			
//			
//		}
//
//			
//		}
//		
	}
	
}
