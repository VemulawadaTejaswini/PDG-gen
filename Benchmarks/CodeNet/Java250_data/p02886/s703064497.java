import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class Main {
		static  Scanner scn=new Scanner(System.in);
		static int count=0;
		public static void main(String[] args) {
			
			int n=scn.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=scn.nextInt();
			}
			long sum=0;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==0)
						break;
					else if(arr[i]>0)
					{
						sum+=arr[i]*arr[j];
					}
				}
			}
			System.out.println(sum);
		}
		public static int gcd(int a,int b)
		{
			if(a==0)return b;
			int l= gcd(b%a,a);
			return l;
		}

		
}
