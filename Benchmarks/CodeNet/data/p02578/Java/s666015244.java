 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 public class Main
 {
 	public static void main(String[]args)
 	{
 		Scanner sc=new Scanner (System.in);
 		int n=sc.nextInt();
 		int i,temp=0;
 		int []arr=new int[n];
 		for(i=0;i<n;i++)
 		{
 			arr[i]=sc.nextInt();

 		}
 		for(i=1;i<n;i++)
 		{
 			if(arr[i-1]>arr[i])
 			{
 				temp=temp+arr[i-1]-arr[i];
 				arr[i]=arr[i-1];
 			}
 		}
 		System.out.println(temp);
 	}
 }