import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	    a[i]=s.nextInt();
	    
	}
	
	int c=1;
	boolean f=false;
	for(int i=0;i<n;i++){
	    if(a[i]==c)
	    {
	        c++;
	        f=true;
	    }
	}
	if(f)
	System.out.println(n-c+1);
	else
	System.out.println(-1);
	    
	}
}