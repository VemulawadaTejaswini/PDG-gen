//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		//int[] pre=new int[n];
		
		for(int i=1;i<n;i++)
		{
			a[i]+=a[i-1];
		}
		int max=a[k-1];
		int start=0;
		for(int i=k;i<n;i++)
		{
			int maybe=a[i]-a[start];
			if(maybe>max)
				max=maybe;
			start++;
		}
		double ans=(double)(max+k)/2;
		System.out.printf("%.12f",ans);

	}

}
