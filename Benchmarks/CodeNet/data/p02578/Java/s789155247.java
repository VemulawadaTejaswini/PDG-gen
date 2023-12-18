import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		
		
		int step=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]<a[i-1])
			{
				step+=(a[i-1]-a[i]);
				a[i]=a[i-1];
			}
			else
				continue;
		}
		System.out.println(step);
	}

}
