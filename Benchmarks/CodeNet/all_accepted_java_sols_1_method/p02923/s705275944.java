import java.util.Scanner;
	
	import java.util.Arrays;
	public class Main {
		static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=scn.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
		}
		int count=0,max=0;
		if(n==1)	System.out.println("0");
		else if(n>1)
		{int i=0,j=1;
			while(j<n)
			{
				if(a[i]>=a[j])	
				{
					count++;
					i++;j++;
				}
				else if(a[i]<a[j])
				{
					i++;
					j++;
					max=Math.max(max,count);
					count=0;
				}
				
				
			}
			max=Math.max(max, count);
			System.out.println(max);
		}
		}
	
	}
