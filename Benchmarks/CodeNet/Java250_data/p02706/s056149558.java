import java.util.*;
class Main
{
	public static void main(String[] args)                                        
	{
		Scanner sc=new Scanner(System.in);
		int t,k;
		t=sc.nextInt();
		k=sc.nextInt();
		int sum=0;
		int a[]=new int[k];
		for(int i=0;i<k;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<k;i++)
	sum+=a[i];
	if(t>=sum)	
		System.out.println(t-sum);
		else
		
		 System.out.println(-1);
	
		
	}
	
	
			
	
		
}

