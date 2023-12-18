
import java.util.Scanner;
public class Main 
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
	    final int MAX=50;
	    String[] str1=new String[MAX];
	    String[]str2=new String[MAX];
		int n;
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			str1[i]=in.next();
			str2[i]=str1[i];
			
		}
		
		BubbleSort(str1,n);
		print(str1,n);
		System.out.println("Stable");
		
		
		
		SelectionSort(str2, n);
		print(str2,n);
		
		if(isStable(str1, str2, n)) {
			System.out.println("Stable");
			
		}else {
			System.out.println("Not stable");
		}
		
		
		
		
		
		
	
	}
	
	static void BubbleSort(String[] str,int n)
	{   
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(str[j+1].charAt(1)<str[j].charAt(1))
				{
					String temp=str[j+1];
					str[j+1]=str[j];
					str[j]=temp;
				}
			}
		}
	}
	
	static void SelectionSort(String[] str,int n)
	{
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i;j<n;j++)
			{
				if(str[j].charAt(1)<str[min].charAt(1))
				{
					min=j;
					flag=true;
				}
				
			}
			if(flag)
			{
				String temp=str[i];
				str[i]=str[min];
				str[min]=temp;
			}
			
			
			
		}
	}
	
	static void print(String[]str,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(str[i]);
			if(i!=n)
				System.out.print(" ");
		}
		System.out.println();
	}
	
	static boolean isStable(String[]str1,String[]str2,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(str1[i].charAt(0)!=str2[i].charAt(0))
				return false;
		}
		
		return true;
	}
	
	
	

}