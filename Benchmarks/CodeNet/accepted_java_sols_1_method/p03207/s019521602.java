import java.io.IOException;
import java.util.ArrayList;
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
		int[] a=new int[n+1];
		long ans=0;
		int maxx=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=in.nextInt();
			maxx=Math.max(a[i], maxx);
			ans=ans+a[i];
		}
		
		System.out.println(ans-maxx/2);
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
