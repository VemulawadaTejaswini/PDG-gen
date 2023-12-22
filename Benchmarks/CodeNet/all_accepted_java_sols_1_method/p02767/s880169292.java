//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int avg = sum/n;
		int ans=Integer.MAX_VALUE;
		int pos=-1;
		for(int i=avg;i<=avg+1;i++)
		{
			int s=0;
			for(int x:a)
			{
				s+=(Math.pow((i-x),2));
			}
			if(s<ans)
			{
				ans=s;
				pos=i;
			}
				
				
		}
		System.out.println(ans);
		
		

	}

}
