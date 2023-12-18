//package hiougyf;
import java.util.*;
//import java.lang.instrument.*;
import java.math.*;
import java.io.*;
public class Main {
	  public static void main  (String[] args)
	  	{
		  Scanner sc =new Scanner(System.in);
		  int n=sc.nextInt();
		  int a[]=new int[n+2];
		  boolean s[]=new boolean[n+2];
		  a[0]=0;
		  a[1]=1;
		  for(int i=2;i<=n;i++) {
			  a[i]=2;
			  s[i]=true;
		  }
		  	
		  	for(int i=2;i<=n;i++) {
		  		//if(s[i]) {
		  			int j=2;
		  			while(i*j<=n){
		  				if(s[i*j]==false) {
		  					//System.out.println(j+"fd");
		  					a[j*i]++;
		  				}
		  				else 
		  					{
		  					a[i*j]++;
		  					s[i*j]=false;
		  					}
		  				j++;
		  			}
		  		//}
		  	}
		  	long gg=0;
		  	for(int i=1;i<=n;i++) {
		 // 	System.out.print(a[i]+" "+s[i]);
		  		gg+=(i*(long)a[i]);
		  	}
		System.out.println(gg);
	  	}
	  
}