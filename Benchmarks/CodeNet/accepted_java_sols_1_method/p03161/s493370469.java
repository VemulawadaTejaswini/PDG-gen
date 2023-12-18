//package src;
import java.io.*;
//import javafx.util.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc =new Scanner(System.in);
	 int n=sc.nextInt(),k=sc.nextInt();
	 int a[]=new int[n];
	 int dp[]=new int[n];
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	 }
	
	 dp[0]=0;
	 dp[1]=Math.abs(a[1]-a[0]);
	 for(int i=2;i<n;i++) {
		 int min=Integer.MAX_VALUE;
		 for(int k1=1;k1<=k&&k1<=i;k1++) {
		 min=Math.min(Math.abs(a[i]-a[i-k1])+dp[i-k1],min);
		 
		//if(i==9) System.out.print(dp[i]+" "+min+" d");
		 }
		 dp[i]=min;
	 }
	 System.out.print(dp[n-1]);
	 //}
	}
}