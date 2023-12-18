import java.math.*;
import java.util.*;
  
  

public class Main {

	static int n;
	static int in[]=new int[10];
	static boolean ans;
	public static void main(String[] args) {
          
        
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
        	n=scan.nextInt();
	        for(int i=0;i<n;i++) {
	        	
	        	for(int j=0;j<10;j++)in[j]=scan.nextInt();
	        	ans=false;
	        	dfs(0,0,0);
	        	System.out.println(ans?"YES":"NO");
	        }
        }
        
        
        
        
	}
	private static void dfs(int d,int left,int right) {
		if(ans)return;
		if(d==10) {
			ans=true;
			return ;
		}
		if(in[d]>left)dfs(d+1,in[d],right);
		if(in[d]>right)dfs(d+1,left,in[d]);
			
		

	}
	
	
	
	
}
