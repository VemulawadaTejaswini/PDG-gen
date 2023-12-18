import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=(int) Math.sqrt(n);

	    int[] ans=new int[n+1];
	    
	   
	    
	    for(int s=1;s<=n;s++) {
	    
	    	for(int x=1;x<=m;x++) {
	    		if(x*x>=s)break;
		    	for(int y=x;y<=m;y++) {
		    		if(x*x+y*y+x*y>=s)continue;
		    		for(int z=y;z<=m;z++) {
		    			if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)==s) {
		    				if(x==y && y==z)ans[s]++;
		    				else if(x!=y && y!=z && z!=x)ans[s]+=6;
		    				else ans[s]+=3;
		    			}
		    		}
		    		
		    	}
		    	
		    }
	    
	    }
	    
	    for(int s=1;s<=n;s++) {
	    	System.out.println(ans[s]);
	    }

	    
	}
}
