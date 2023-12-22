import java.util.*;
class Main
{
	public static void main(String[] args)                                        
	{
		Scanner sc=new Scanner(System.in);
		int t,k;
		
		k=sc.nextInt();
		int sum=0;
		int a[]=new int[200010];
		int arr[]=new int[200010];

		for(int i=2;i<=k;i++)
		a[i]=sc.nextInt();
		for(int i=2;i<=k;i++)
		arr[a[i]]++;
		for(int i=1;i<=k;i++)
		System.out.println(arr[i]+"");
		
	
		
	}
	
	
			
	
		
}

