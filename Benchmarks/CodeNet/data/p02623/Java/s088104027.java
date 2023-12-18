import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int k=sc.nextInt();
	    int[] a=new int[n];
	    int[] b=new int[m];
	    
	    int[] ac=new int[n];
	    int[] bc=new int[m];
	   
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    	if(i!=0)ac[i]=ac[i-1]+a[i];
	    	else ac[i]=a[i];
	    	
	    }
	    int c=0;
	    for(int i=0;i<m;i++) {
	    	b[i]=sc.nextInt();
	    	if(i!=0)bc[i]=bc[i-1]+b[i];
	    	else bc[i]=b[i];
	    }
	    
	    int ans=0;
	    int best=m-1;
	    int ind=m-1;
		for(int i=0;i<n;i++) {
			if(ac[i]>k)break;
			int rest=k-ac[i];
			
			while(bc[ind]>rest) {
				ind--;
			}
			
			ans=Math.max(i+ind+2, ans);
		}
		    
		
		System.out.println(ans);
	}

}
	