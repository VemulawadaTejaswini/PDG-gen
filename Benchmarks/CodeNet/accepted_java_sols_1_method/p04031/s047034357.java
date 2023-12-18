//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int s=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			s=s+a[i];
		}
		s=(s/n)+((s%n==0)?0:1);
		int n1=s;
		int n2=s-1;
		int cost1=0,cost2=0;
		for(int i=0;i<n;i++)
		{
			cost1=cost1+(int)Math.pow((n1-a[i]),2);
			cost2=cost2+(int)Math.pow((n2-a[i]),2);
			
		}
		int cost=Math.min(cost1, cost2);
		System.out.println(cost);

	}

}
