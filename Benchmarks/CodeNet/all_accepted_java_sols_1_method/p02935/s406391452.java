
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
		Arrays.parallelSort(ar);
		float ans=0;
		float lol[]=new float[n];
		lol[0]=ar[0];
		for(int i=1;i<n;i++)
		{
			lol[i]=(float) ((ar[i]+lol[i-1])/2);
		}
		
		System.out.printf("%.04f",lol[n-1]);
	}
}
