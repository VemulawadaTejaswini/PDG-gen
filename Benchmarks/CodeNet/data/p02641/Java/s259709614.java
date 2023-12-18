import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int n=sc.nextInt();
	    if(n==0) {
	    	 System.out.println(x);
	    	 System.exit(0);
	    }
	    int[] p=new int[n];
	    
	    for(int i=0;i<n;i++) {
	    	p[i]=sc.nextInt();
	    }
	    Arrays.sort(p);
	    int ans=0;
	    int dist=1000;
	    int ind=0;
	    for(int i=p[0]-1;i<=p[n-1]+1;i++) {
	    	if(p[ind]==i) {
	    		if(ind<n-1)ind++;
	    		continue;
	    	}
	    	//System.out.println("i "+i);
	    	//System.out.println("dist "+dist);
	    		int tmp=Math.abs(i-x);
	    		if(tmp>=dist) {
	    			break;
	    	    }else {
	    		    dist=tmp;
	    		    ans=i;
	    	    }
	    	
	    }
	    
	    System.out.println(ans);
	}
}
