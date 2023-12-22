
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int q=scan.nextInt();
		String eg=scan.next();
		int prefix[]=new int[n];
		for(int i=1;i<n;i++)
		{
			if(eg.charAt(i)=='C'&& eg.charAt(i-1)=='A') {
				prefix[i]=prefix[i-1]+1;
			}else {
				prefix[i]=prefix[i-1];
			}
		}
		for(int i=0;i<q;i++)
		{
			int l=scan.nextInt();
			int r=scan.nextInt();
			r--;
			l--;
			System.out.println(prefix[r]-prefix[l]);
		}
			
		
	}
}
