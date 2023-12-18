
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n+1];
		int temp=k;
		int d=0,val=0,count=0;
		while(k!=0)
		{
		 d=sc.nextInt();
		 for(int i=0;i<d;i++)
		 {
		     val=sc.nextInt();
		     arr[val]++;
		 }
		 k--;
		}
		 for(int i=0;i<=n;i++)
		 {
		     if(arr[i]==0)
		     count++;
		 }
		 count--;
		 System.out.println(count);
		
	}
}