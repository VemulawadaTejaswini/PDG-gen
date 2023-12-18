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
	   int[]b =new int[n]; 
	   
	    
	    for(int i=0;i<n;i++) {
	    	List<Integer> rl=new ArrayList<>();
	    	for(int j=0;j<n;j++)  {
	    		if(b[j]==-1)continue;
	    		if(i!=j && a[j]%a[i]==0) {
	    			b[j]=-1;
	    		}
	    	}
	    }
	    int ans=0;
	    for(int i=0;i<n;i++) {
	    	if(b[i]==0)ans++;
	    }
		
		System.out.println(ans);
	}
}
