import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a =new int[n];
	    
		
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    }
	    
	   Arrays.sort(a);
	   int last=a[n-1]+1;
	   int[] l=new int[last];
	   
	    
	   for(int i=0;i<n;i++) {
		   int c=a[i];
	    	while(c<last) {
	    		l[c]++;
	    		c+=a[i];
	    	}
	    }
	   int ans=0;
	   for(int i=0;i<n;i++) {
		   if(l[a[i]]==1) {
			   //System.out.println(a[i]);
			   ans++;
		   }
		   
	   }
		System.out.println(ans);
	}
}
